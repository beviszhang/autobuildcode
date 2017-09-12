package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_case_three")
public class MgrCaseThree implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "twoid")
	private Integer twoid;// 二级节点ID
	
	@Column(name = "threename")
	private String threename;// 节点名称
	
	@Column(name = "threesort")
	private Integer threesort;// 节点排序
	
	@Column(name = "content")
	private String content;// 节点内容
	
	@Column(name = "type")
	private Integer type;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getTwoid(){
		return this.twoid;
	}
	public void setTwoid(Integer twoid){
		this.twoid = twoid;
	}
	public String getThreename(){
		return this.threename;
	}
	public void setThreename(String threename){
		this.threename = threename == null ? null : threename.trim();
	}
	public Integer getThreesort(){
		return this.threesort;
	}
	public void setThreesort(Integer threesort){
		this.threesort = threesort;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content == null ? null : content.trim();
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type = type;
	}
	
}