package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_chapter_temp")
public class MgrChapterTemp implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "tname")
	private String tname;// 节点名称
	
	@Column(name = "pid")
	private Integer pid;// 
	
	@Column(name = "sort")
	private Integer sort;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getTname(){
		return this.tname;
	}
	public void setTname(String tname){
		this.tname = tname == null ? null : tname.trim();
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