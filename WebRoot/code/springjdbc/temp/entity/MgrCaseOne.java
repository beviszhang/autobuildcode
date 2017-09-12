package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_case_one")
public class MgrCaseOne implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "chapterid")
	private Integer chapterid;// 案例章节ID
	
	@Column(name = "onename")
	private String onename;// 节点名称
	
	@Column(name = "onesort")
	private Integer onesort;// 节点排序
	
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
	public Integer getChapterid(){
		return this.chapterid;
	}
	public void setChapterid(Integer chapterid){
		this.chapterid = chapterid;
	}
	public String getOnename(){
		return this.onename;
	}
	public void setOnename(String onename){
		this.onename = onename == null ? null : onename.trim();
	}
	public Integer getOnesort(){
		return this.onesort;
	}
	public void setOnesort(Integer onesort){
		this.onesort = onesort;
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