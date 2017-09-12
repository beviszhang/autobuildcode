package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "cms_announce")
public class CmsAnnounce implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "title")
	private String title;// 
	
	@Column(name = "content")
	private String content;// 
	
	@Column(name = "sort")
	private Integer sort;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "pubdate")
	private Date pubdate;// 
	
	@Column(name = "pubuserid")
	private Integer pubuserid;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title == null ? null : title.trim();
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content == null ? null : content.trim();
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Date getPubdate(){
		return this.pubdate;
	}
	public void setPubdate(Date pubdate){
		this.pubdate = pubdate;
	}
	public Integer getPubuserid(){
		return this.pubuserid;
	}
	public void setPubuserid(Integer pubuserid){
		this.pubuserid = pubuserid;
	}
	
}