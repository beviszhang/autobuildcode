package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_apply_course")
public class MgrApplyCourse implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "userid")
	private Integer userid;// 申请用户id
	
	@Column(name = "courseid")
	private Integer courseid;// 申请课程Id
	
	@Column(name = "applyreason")
	private String applyreason;// 申请理由
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "applydate")
	private Date applydate;// 申请时间
	
	@Column(name = "applystatus")
	private Integer applystatus;// 申请状态：0:未审核（默认） 1：审核通过 -1：审核未通过
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 
	
	@Column(name = "updateby")
	private Integer updateby;// 
	
	@Column(name = "type")
	private Integer type;// 类型: 空-课程,1案例
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid = courseid;
	}
	public String getApplyreason(){
		return this.applyreason;
	}
	public void setApplyreason(String applyreason){
		this.applyreason = applyreason == null ? null : applyreason.trim();
	}
	public Date getApplydate(){
		return this.applydate;
	}
	public void setApplydate(Date applydate){
		this.applydate = applydate;
	}
	public Integer getApplystatus(){
		return this.applystatus;
	}
	public void setApplystatus(Integer applystatus){
		this.applystatus = applystatus;
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
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type = type;
	}
	
}