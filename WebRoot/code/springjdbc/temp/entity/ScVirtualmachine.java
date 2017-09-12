package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "sc_virtualmachine")
public class ScVirtualmachine implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "taskid")
	private Integer taskid;// 
	
	@Column(name = "taskname")
	private String taskname;// 
	
	@Column(name = "vncid")
	private String vncid;// 
	
	@Column(name = "vncname")
	private String vncname;// 
	
	@Column(name = "vncstate")
	private String vncstate;// 
	
	@Column(name = "userid")
	private Integer userid;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatetime")
	private Date updatetime;// 
	
	@Column(name = "updateby")
	private Integer updateby;// 
	

	 

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
	public String getVncid(){
		return this.vncid;
	}
	public void setVncid(String vncid){
		this.vncid = vncid == null ? null : vncid.trim();
	}
	public String getVncname(){
		return this.vncname;
	}
	public void setVncname(String vncname){
		this.vncname = vncname == null ? null : vncname.trim();
	}
	public String getVncstate(){
		return this.vncstate;
	}
	public void setVncstate(String vncstate){
		this.vncstate = vncstate == null ? null : vncstate.trim();
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public Date getUpdatetime(){
		return this.updatetime;
	}
	public void setUpdatetime(Date updatetime){
		this.updatetime = updatetime;
	}
	public Integer getUpdateby(){
		return this.updateby;
	}
	public void setUpdateby(Integer updateby){
		this.updateby = updateby;
	}
	
}