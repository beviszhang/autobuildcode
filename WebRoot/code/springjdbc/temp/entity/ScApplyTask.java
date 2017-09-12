package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "sc_apply_task")
public class ScApplyTask implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "taskid")
	private Integer taskid;// 
	
	@Column(name = "taskname")
	private String taskname;// 
	
	@Column(name = "userid")
	private Integer userid;// 
	
	@Column(name = "username")
	private String username;// 
	
	@Column(name = "applystate")
	private Integer applystate;// 审核状态：0、审核中，1、未通过，2、已通过
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getTaskid(){
		return this.taskid;
	}
	public void setTaskid(Integer taskid){
		this.taskid = taskid;
	}
	public String getTaskname(){
		return this.taskname;
	}
	public void setTaskname(String taskname){
		this.taskname = taskname == null ? null : taskname.trim();
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username == null ? null : username.trim();
	}
	public Integer getApplystate(){
		return this.applystate;
	}
	public void setApplystate(Integer applystate){
		this.applystate = applystate;
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	
}