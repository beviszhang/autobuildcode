package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_map_dict")
public class TbMapDict implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "type")
	private Integer type;// 菜单级别
	
	@Column(name = "dictname")
	private String dictname;// 字典名称
	
	@Column(name = "pid")
	private Integer pid;// 父ID
	
	@Column(name = "sort")
	private Integer sort;// 排序
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type = type;
	}
	public String getDictname(){
		return this.dictname;
	}
	public void setDictname(String dictname){
		this.dictname = dictname == null ? null : dictname.trim();
	}
	public Integer getPid(){
		return this.pid;
	}
	public void setPid(Integer pid){
		this.pid = pid;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	
}