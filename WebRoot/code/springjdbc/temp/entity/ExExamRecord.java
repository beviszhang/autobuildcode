package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "ex_exam_record")
public class ExExamRecord implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "classid")
	private Integer classid;// 班级id
	
	@Column(name = "userid")
	private Integer userid;// 考试人Id
	
	@Column(name = "score")
	private Integer score;// 总分数
	
	@Column(name = "selectscore")
	private Integer selectscore;// 
	
	@Column(name = "jiandascore")
	private Integer jiandascore;// 
	
	@Column(name = "courseid")
	private Integer courseid;// 课程id
	
	@Column(name = "chapid")
	private Integer chapid;// 章节Id
	
	@Column(name = "paperid")
	private Integer paperid;// 试卷Id
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "begindate")
	private Date begindate;// 开始时间
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "enddate")
	private Date enddate;// 提交时间
	
	@Column(name = "status")
	private Integer status;// 状态（0：未提交1：已提交未批改2：已批改）
	
	@Column(name = "checkuserid")
	private Integer checkuserid;// 批卷人
	
	@Column(name = "checkusername")
	private String checkusername;// 批卷人姓名
	
	@Column(name = "checkdesc")
	private String checkdesc;// 批卷人评语
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "checkdate")
	private Date checkdate;// 
	

	 

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
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public Integer getScore(){
		return this.score;
	}
	public void setScore(Integer score){
		this.score = score;
	}
	public Integer getSelectscore(){
		return this.selectscore;
	}
	public void setSelectscore(Integer selectscore){
		this.selectscore = selectscore;
	}
	public Integer getJiandascore(){
		return this.jiandascore;
	}
	public void setJiandascore(Integer jiandascore){
		this.jiandascore = jiandascore;
	}
	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid = courseid;
	}
	public Integer getChapid(){
		return this.chapid;
	}
	public void setChapid(Integer chapid){
		this.chapid = chapid;
	}
	public Integer getPaperid(){
		return this.paperid;
	}
	public void setPaperid(Integer paperid){
		this.paperid = paperid;
	}
	public Date getBegindate(){
		return this.begindate;
	}
	public void setBegindate(Date begindate){
		this.begindate = begindate;
	}
	public Date getEnddate(){
		return this.enddate;
	}
	public void setEnddate(Date enddate){
		this.enddate = enddate;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public Integer getCheckuserid(){
		return this.checkuserid;
	}
	public void setCheckuserid(Integer checkuserid){
		this.checkuserid = checkuserid;
	}
	public String getCheckusername(){
		return this.checkusername;
	}
	public void setCheckusername(String checkusername){
		this.checkusername = checkusername == null ? null : checkusername.trim();
	}
	public String getCheckdesc(){
		return this.checkdesc;
	}
	public void setCheckdesc(String checkdesc){
		this.checkdesc = checkdesc == null ? null : checkdesc.trim();
	}
	public Date getCheckdate(){
		return this.checkdate;
	}
	public void setCheckdate(Date checkdate){
		this.checkdate = checkdate;
	}
	
}