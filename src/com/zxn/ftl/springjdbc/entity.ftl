package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "${tblName}")
public class ${objectNameUpper} implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	<#list fieldList?sort_by("colunmIndex") as column>
	<#if column.dataType == 91>
		@DateTimeFormat(pattern = "yyyy-MM-dd")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")// 查询日期时使用
	<#elseif column.dataType == 92>
	@DateTimeFormat(pattern = "HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	<#elseif column.dataType == 93>
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	</#if>
	<#if column.isPk == 1>
	@Id
	</#if>
	@Column(name = "${column.columnDBName}")
	private ${column.columnClassName} ${column.columnName};// ${column.columnLabel}
	
	</#list>  

	 

	/*#####################get  and  set#####################*/
	
	<#list fieldList?sort_by("colunmIndex") as column>
	public ${column.columnClassName} get${column.columnNameUpper}(){
		return this.${column.columnName};
	}
	<#if column.columnClassName == "String">
	public void set${column.columnNameUpper}(${column.columnClassName} ${column.columnName}){
		this.${column.columnName} = ${column.columnName} == null ? null : ${column.columnName}.trim();
	}
	<#else>
	public void set${column.columnNameUpper}(${column.columnClassName} ${column.columnName}){
		this.${column.columnName} = ${column.columnName};
	}
	</#if>
	</#list>
	
}