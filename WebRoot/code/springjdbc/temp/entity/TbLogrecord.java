package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_logrecord")
public class TbLogrecord implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "userid")
	private Integer userid;// 
	
	@Column(name = "ip")
	private String ip;// 
	
	@Column(name = "loginflag")
	private String loginflag;// 状态：0：登录  1：退出
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "logindate")
	private Date logindate;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "logoutdate")
	private Date logoutdate;// 
	

	 

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
	public String getIp(){
		return this.ip;
	}
	public void setIp(String ip){
		this.ip = ip == null ? null : ip.trim();
	}
	public String getLoginflag(){
		return this.loginflag;
	}
	public void setLoginflag(String loginflag){
		this.loginflag = loginflag == null ? null : loginflag.trim();
	}
	public Date getLogindate(){
		return this.logindate;
	}
	public void setLogindate(Date logindate){
		this.logindate = logindate;
	}
	public Date getLogoutdate(){
		return this.logoutdate;
	}
	public void setLogoutdate(Date logoutdate){
		this.logoutdate = logoutdate;
	}
	
}