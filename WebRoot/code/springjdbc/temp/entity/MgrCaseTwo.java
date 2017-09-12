package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_case_two")
public class MgrCaseTwo implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "oneid")
	private Integer oneid;// 一级节点ID
	
	@Column(name = "twoname")
	private String twoname;// 节点名称
	
	@Column(name = "twosort")
	private Integer twosort;// 节点排序
	
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
	public Integer getOneid(){
		return this.oneid;
	}
	public void setOneid(Integer oneid){
		this.oneid = oneid;
	}
	public String getTwoname(){
		return this.twoname;
	}
	public void setTwoname(String twoname){
		this.twoname = twoname == null ? null : twoname.trim();
	}
	public Integer getTwosort(){
		return this.twosort;
	}
	public void setTwosort(Integer twosort){
		this.twosort = twosort;
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