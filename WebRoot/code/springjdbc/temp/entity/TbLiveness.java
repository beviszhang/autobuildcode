package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_liveness")
public class TbLiveness implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "userid")
	private Integer userid;// 
	
	@Column(name = "classid")
	private Integer classid;// 
	
	@Column(name = "ip")
	private String ip;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "logintime")
	private Date logintime;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "loginouttime")
	private Date loginouttime;// 
	
	@Column(name = "loginflag")
	private String loginflag;// 
	

	 

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
	public Integer getClassid(){
		return this.classid;
	}
	public void setClassid(Integer classid){
		this.classid = classid;
	}
	public String getIp(){
		return this.ip;
	}
	public void setIp(String ip){
		this.ip = ip == null ? null : ip.trim();
	}
	public Date getLogintime(){
		return this.logintime;
	}
	public void setLogintime(Date logintime){
		this.logintime = logintime;
	}
	public Date getLoginouttime(){
		return this.loginouttime;
	}
	public void setLoginouttime(Date loginouttime){
		this.loginouttime = loginouttime;
	}
	public String getLoginflag(){
		return this.loginflag;
	}
	public void setLoginflag(String loginflag){
		this.loginflag = loginflag == null ? null : loginflag.trim();
	}
	
}