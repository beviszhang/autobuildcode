package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_test_report")
public class MgrTestReport implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "docid")
	private Integer docid;// 
	
	@Column(name = "userid")
	private Integer userid;// 
	
	@Column(name = "classesid")
	private Integer classesid;// 
	
	@Column(name = "text")
	private String text;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 
	
	@Column(name = "score")
	private String score;// 
	
	@Column(name = "state")
	private String state;// (未批阅2 已批阅3) 未提交1-不存储
	
	@Column(name = "teacherid")
	private Integer teacherid;// 
	
	@Column(name = "courseid")
	private Integer courseid;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getDocid(){
		return this.docid;
	}
	public void setDocid(Integer docid){
		this.docid = docid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public Integer getClassesid(){
		return this.classesid;
	}
	public void setClassesid(Integer classesid){
		this.classesid = classesid;
	}
	public String getText(){
		return this.text;
	}
	public void setText(String text){
		this.text = text == null ? null : text.trim();
	}
	public Date getUpdatedate(){
		return this.updatedate;
	}
	public void setUpdatedate(Date updatedate){
		this.updatedate = updatedate;
	}
	public String getScore(){
		return this.score;
	}
	public void setScore(String score){
		this.score = score == null ? null : score.trim();
	}
	public String getState(){
		return this.state;
	}
	public void setState(String state){
		this.state = state == null ? null : state.trim();
	}
	public Integer getTeacherid(){
		return this.teacherid;
	}
	public void setTeacherid(Integer teacherid){
		this.teacherid = teacherid;
	}
	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid = courseid;
	}
	
}