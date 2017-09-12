package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tbl_case01_summarize")
public class TblCase01Summarize implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "ccase01_uuid")
	private Integer ccase01Uuid;// 
	
	@Column(name = "ccase01_class_uuid")
	private Integer ccase01ClassUuid;// 班级id
	
	@Column(name = "ccase01_user_uuid")
	private Integer ccase01UserUuid;// 学生id
	
	@Column(name = "ccase01_score")
	private Integer ccase01Score;// 分数
	
	@Column(name = "ccase01_case_uuid")
	private Integer ccase01CaseUuid;// 案例id
	
	@Column(name = "ccase01_url")
	private String ccase01Url;// 成果展示
	
	@Column(name = "ccase01_plan")
	private String ccase01Plan;// 项目计划与进度实施情况
	
	@Column(name = "ccase01_experience")
	private String ccase01Experience;// 经验总结
	
	@Column(name = "ccase01_question")
	private String ccase01Question;// 问题总结
	
	@Column(name = "ccase01_status")
	private Integer ccase01Status;// 状态（0：未提交1：未批阅2：已批阅）
	
	@Column(name = "ccase01_check_user_uuid")
	private Integer ccase01CheckUserUuid;// 批卷人
	
	@Column(name = "ccase01_check_user_name")
	private String ccase01CheckUserName;// 批卷人姓名
	
	@Column(name = "ccase01_check_info")
	private String ccase01CheckInfo;// 批卷人批注
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "ccase01_check_date")
	private Date ccase01CheckDate;// 批卷日期
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "ccase01_create_date")
	private Date ccase01CreateDate;// 创建日期
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "ccase01_update_date")
	private Date ccase01UpdateDate;// 最后更新时间
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getCcase01Uuid(){
		return this.ccase01Uuid;
	}
	public void setCcase01Uuid(Integer ccase01Uuid){
		this.ccase01Uuid = ccase01Uuid;
	}
	public Integer getCcase01ClassUuid(){
		return this.ccase01ClassUuid;
	}
	public void setCcase01ClassUuid(Integer ccase01ClassUuid){
		this.ccase01ClassUuid = ccase01ClassUuid;
	}
	public Integer getCcase01UserUuid(){
		return this.ccase01UserUuid;
	}
	public void setCcase01UserUuid(Integer ccase01UserUuid){
		this.ccase01UserUuid = ccase01UserUuid;
	}
	public Integer getCcase01Score(){
		return this.ccase01Score;
	}
	public void setCcase01Score(Integer ccase01Score){
		this.ccase01Score = ccase01Score;
	}
	public Integer getCcase01CaseUuid(){
		return this.ccase01CaseUuid;
	}
	public void setCcase01CaseUuid(Integer ccase01CaseUuid){
		this.ccase01CaseUuid = ccase01CaseUuid;
	}
	public String getCcase01Url(){
		return this.ccase01Url;
	}
	public void setCcase01Url(String ccase01Url){
		this.ccase01Url = ccase01Url == null ? null : ccase01Url.trim();
	}
	public String getCcase01Plan(){
		return this.ccase01Plan;
	}
	public void setCcase01Plan(String ccase01Plan){
		this.ccase01Plan = ccase01Plan == null ? null : ccase01Plan.trim();
	}
	public String getCcase01Experience(){
		return this.ccase01Experience;
	}
	public void setCcase01Experience(String ccase01Experience){
		this.ccase01Experience = ccase01Experience == null ? null : ccase01Experience.trim();
	}
	public String getCcase01Question(){
		return this.ccase01Question;
	}
	public void setCcase01Question(String ccase01Question){
		this.ccase01Question = ccase01Question == null ? null : ccase01Question.trim();
	}
	public Integer getCcase01Status(){
		return this.ccase01Status;
	}
	public void setCcase01Status(Integer ccase01Status){
		this.ccase01Status = ccase01Status;
	}
	public Integer getCcase01CheckUserUuid(){
		return this.ccase01CheckUserUuid;
	}
	public void setCcase01CheckUserUuid(Integer ccase01CheckUserUuid){
		this.ccase01CheckUserUuid = ccase01CheckUserUuid;
	}
	public String getCcase01CheckUserName(){
		return this.ccase01CheckUserName;
	}
	public void setCcase01CheckUserName(String ccase01CheckUserName){
		this.ccase01CheckUserName = ccase01CheckUserName == null ? null : ccase01CheckUserName.trim();
	}
	public String getCcase01CheckInfo(){
		return this.ccase01CheckInfo;
	}
	public void setCcase01CheckInfo(String ccase01CheckInfo){
		this.ccase01CheckInfo = ccase01CheckInfo == null ? null : ccase01CheckInfo.trim();
	}
	public Date getCcase01CheckDate(){
		return this.ccase01CheckDate;
	}
	public void setCcase01CheckDate(Date ccase01CheckDate){
		this.ccase01CheckDate = ccase01CheckDate;
	}
	public Date getCcase01CreateDate(){
		return this.ccase01CreateDate;
	}
	public void setCcase01CreateDate(Date ccase01CreateDate){
		this.ccase01CreateDate = ccase01CreateDate;
	}
	public Date getCcase01UpdateDate(){
		return this.ccase01UpdateDate;
	}
	public void setCcase01UpdateDate(Date ccase01UpdateDate){
		this.ccase01UpdateDate = ccase01UpdateDate;
	}
	
}