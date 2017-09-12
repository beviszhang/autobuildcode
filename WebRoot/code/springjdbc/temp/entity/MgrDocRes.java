package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_doc_res")
public class MgrDocRes implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "fileid")
	private Integer fileid;// 
	
	@Column(name = "doclab")
	private String doclab;// 实验标签
	
	@Column(name = "docname")
	private String docname;// 实验名
	
	@Column(name = "point")
	private String point;// 实验重点
	
	@Column(name = "purpose")
	private String purpose;// 实验目的
	
	@Column(name = "score")
	private Integer score;// 分数
	
	@Column(name = "docurl")
	private String docurl;// 文档位置
	
	@Column(name = "minutes")
	private Integer minutes;// 实验时长
	
	@Column(name = "resourceurl")
	private String resourceurl;// 文档源位置；课程Id+,+章节Id 的形式
	
	@Column(name = "content")
	private String content;// 文档内容
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 
	
	@Column(name = "updateby")
	private Integer updateby;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getFileid(){
		return this.fileid;
	}
	public void setFileid(Integer fileid){
		this.fileid = fileid;
	}
	public String getDoclab(){
		return this.doclab;
	}
	public void setDoclab(String doclab){
		this.doclab = doclab == null ? null : doclab.trim();
	}
	public String getDocname(){
		return this.docname;
	}
	public void setDocname(String docname){
		this.docname = docname == null ? null : docname.trim();
	}
	public String getPoint(){
		return this.point;
	}
	public void setPoint(String point){
		this.point = point == null ? null : point.trim();
	}
	public String getPurpose(){
		return this.purpose;
	}
	public void setPurpose(String purpose){
		this.purpose = purpose == null ? null : purpose.trim();
	}
	public Integer getScore(){
		return this.score;
	}
	public void setScore(Integer score){
		this.score = score;
	}
	public String getDocurl(){
		return this.docurl;
	}
	public void setDocurl(String docurl){
		this.docurl = docurl == null ? null : docurl.trim();
	}
	public Integer getMinutes(){
		return this.minutes;
	}
	public void setMinutes(Integer minutes){
		this.minutes = minutes;
	}
	public String getResourceurl(){
		return this.resourceurl;
	}
	public void setResourceurl(String resourceurl){
		this.resourceurl = resourceurl == null ? null : resourceurl.trim();
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content == null ? null : content.trim();
	}
	public Date getUpdatedate(){
		return this.updatedate;
	}
	public void setUpdatedate(Date updatedate){
		this.updatedate = updatedate;
	}
	public Integer getUpdateby(){
		return this.updateby;
	}
	public void setUpdateby(Integer updateby){
		this.updateby = updateby;
	}
	
}