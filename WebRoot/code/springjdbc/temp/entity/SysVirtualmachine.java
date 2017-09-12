package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "sys_virtualmachine")
public class SysVirtualmachine implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "vncid")
	private String vncid;// 虚拟机Id
	
	@Column(name = "vncname")
	private String vncname;// 虚拟机名称
	
	@Column(name = "courseid")
	private Integer courseid;// 课程Id
	
	@Column(name = "coursename")
	private String coursename;// 课程名称
	
	@Column(name = "classid")
	private Integer classid;// 班级Id
	
	@Column(name = "classname")
	private String classname;// 班级名称
	
	@Column(name = "userid")
	private Integer userid;// 使用人Id
	
	@Column(name = "username")
	private String username;// 使用人姓名
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 更新时间
	
	@Column(name = "updateby")
	private Integer updateby;// 更新人
	
	@Column(name = "type")
	private Integer type;// 0:非集群1：主2：从
	
	@Column(name = "configflag")
	private Integer configflag;// 是否修改过配置文件 默认0：无  1：是  
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
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
	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid = courseid;
	}
	public String getCoursename(){
		return this.coursename;
	}
	public void setCoursename(String coursename){
		this.coursename = coursename == null ? null : coursename.trim();
	}
	public Integer getClassid(){
		return this.classid;
	}
	public void setClassid(Integer classid){
		this.classid = classid;
	}
	public String getClassname(){
		return this.classname;
	}
	public void setClassname(String classname){
		this.classname = classname == null ? null : classname.trim();
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
	public Integer getConfigflag(){
		return this.configflag;
	}
	public void setConfigflag(Integer configflag){
		this.configflag = configflag;
	}
	
}