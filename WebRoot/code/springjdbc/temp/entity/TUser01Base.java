package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "t_user01_base")
public class TUser01Base implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "cuser01_uuid")
	private Integer cuser01Uuid;// 
	
	@Column(name = "cuser01_name")
	private String cuser01Name;// 
	
	@Column(name = "cuser01_age")
	private Integer cuser01Age;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "cuser01_create_date")
	private Date cuser01CreateDate;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getCuser01Uuid(){
		return this.cuser01Uuid;
	}
	public void setCuser01Uuid(Integer cuser01Uuid){
		this.cuser01Uuid = cuser01Uuid;
	}
	public String getCuser01Name(){
		return this.cuser01Name;
	}
	public void setCuser01Name(String cuser01Name){
		this.cuser01Name = cuser01Name == null ? null : cuser01Name.trim();
	}
	public Integer getCuser01Age(){
		return this.cuser01Age;
	}
	public void setCuser01Age(Integer cuser01Age){
		this.cuser01Age = cuser01Age;
	}
	public Date getCuser01CreateDate(){
		return this.cuser01CreateDate;
	}
	public void setCuser01CreateDate(Date cuser01CreateDate){
		this.cuser01CreateDate = cuser01CreateDate;
	}
	
}