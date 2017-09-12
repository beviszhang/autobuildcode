package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_arrange_course")
public class TbArrangeCourse implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "classid")
	private Integer classid;// 班级Id
	
	@Column(name = "courseid")
	private Integer courseid;// 课程id
	
	@Column(name = "chapterid")
	private Integer chapterid;// 章节
	
	@Column(name = "teacherid")
	private Integer teacherid;// 老师Id
	
	@Column(name = "ruleid")
	private Integer ruleid;// 规则Id
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "startdate")
	private Date startdate;// 开始上课时间
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "enddate")
	private Date enddate;// 结束上课时间
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 创建时间
	
	@Column(name = "publish")
	private Integer publish;// 发布状态 0：未发布  1：已发布
	
	@Column(name = "coursechapterid")
	private Integer coursechapterid;// 课程章节关联表Id
	
	@Column(name = "teachername")
	private String teachername;// 教师姓名
	
	@Column(name = "docid")
	private Integer docid;// 实验文档课程Id
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getClassid(){
		return this.classid;
	}
	public void setClassid(Integer classid){
		this.classid = classid;
	}
	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid = courseid;
	}
	public Integer getChapterid(){
		return this.chapterid;
	}
	public void setChapterid(Integer chapterid){
		this.chapterid = chapterid;
	}
	public Integer getTeacherid(){
		return this.teacherid;
	}
	public void setTeacherid(Integer teacherid){
		this.teacherid = teacherid;
	}
	public Integer getRuleid(){
		return this.ruleid;
	}
	public void setRuleid(Integer ruleid){
		this.ruleid = ruleid;
	}
	public Date getStartdate(){
		return this.startdate;
	}
	public void setStartdate(Date startdate){
		this.startdate = startdate;
	}
	public Date getEnddate(){
		return this.enddate;
	}
	public void setEnddate(Date enddate){
		this.enddate = enddate;
	}
	public Date getUpdatedate(){
		return this.updatedate;
	}
	public void setUpdatedate(Date updatedate){
		this.updatedate = updatedate;
	}
	public Integer getPublish(){
		return this.publish;
	}
	public void setPublish(Integer publish){
		this.publish = publish;
	}
	public Integer getCoursechapterid(){
		return this.coursechapterid;
	}
	public void setCoursechapterid(Integer coursechapterid){
		this.coursechapterid = coursechapterid;
	}
	public String getTeachername(){
		return this.teachername;
	}
	public void setTeachername(String teachername){
		this.teachername = teachername == null ? null : teachername.trim();
	}
	public Integer getDocid(){
		return this.docid;
	}
	public void setDocid(Integer docid){
		this.docid = docid;
	}
	
}