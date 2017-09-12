package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "ex_exam_record_detail")
public class ExExamRecordDetail implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "examid")
	private Integer examid;// 考试记录的id
	
	@Column(name = "pcid")
	private Integer pcid;// 
	
	@Column(name = "quesid")
	private Integer quesid;// 
	
	@Column(name = "answer")
	private String answer;// 
	
	@Column(name = "score")
	private Integer score;// 
	
	@Column(name = "rightflag")
	private Integer rightflag;// 
	
	@Column(name = "remark")
	private String remark;// 备注 评语
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getExamid(){
		return this.examid;
	}
	public void setExamid(Integer examid){
		this.examid = examid;
	}
	public Integer getPcid(){
		return this.pcid;
	}
	public void setPcid(Integer pcid){
		this.pcid = pcid;
	}
	public Integer getQuesid(){
		return this.quesid;
	}
	public void setQuesid(Integer quesid){
		this.quesid = quesid;
	}
	public String getAnswer(){
		return this.answer;
	}
	public void setAnswer(String answer){
		this.answer = answer == null ? null : answer.trim();
	}
	public Integer getScore(){
		return this.score;
	}
	public void setScore(Integer score){
		this.score = score;
	}
	public Integer getRightflag(){
		return this.rightflag;
	}
	public void setRightflag(Integer rightflag){
		this.rightflag = rightflag;
	}
	public String getRemark(){
		return this.remark;
	}
	public void setRemark(String remark){
		this.remark = remark == null ? null : remark.trim();
	}
	
}