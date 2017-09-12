package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "sc_task")
public class ScTask implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "taskname")
	private String taskname;// 
	
		@DateTimeFormat(pattern = "yyyy-MM-dd")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "begindate")
	private Date begindate;// 
	
		@DateTimeFormat(pattern = "yyyy-MM-dd")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "enddate")
	private Date enddate;// 
	
	@Column(name = "imageid")
	private String imageid;// 
	
	@Column(name = "imagename")
	private String imagename;// 
	
	@Column(name = "flavorid")
	private String flavorid;// 
	
	@Column(name = "flavorname")
	private String flavorname;// 
	
	@Column(name = "networkid")
	private String networkid;// 
	
	@Column(name = "networkname")
	private String networkname;// 
	
	@Column(name = "vnum")
	private Integer vnum;// 
	
	@Column(name = "taskdetails")
	private String taskdetails;// 
	
	@Column(name = "auditflag")
	private Integer auditflag;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 
	
	@Column(name = "userid")
	private Integer userid;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getTaskname(){
		return this.taskname;
	}
	public void setTaskname(String taskname){
		this.taskname = taskname == null ? null : taskname.trim();
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
	public String getImageid(){
		return this.imageid;
	}
	public void setImageid(String imageid){
		this.imageid = imageid == null ? null : imageid.trim();
	}
	public String getImagename(){
		return this.imagename;
	}
	public void setImagename(String imagename){
		this.imagename = imagename == null ? null : imagename.trim();
	}
	public String getFlavorid(){
		return this.flavorid;
	}
	public void setFlavorid(String flavorid){
		this.flavorid = flavorid == null ? null : flavorid.trim();
	}
	public String getFlavorname(){
		return this.flavorname;
	}
	public void setFlavorname(String flavorname){
		this.flavorname = flavorname == null ? null : flavorname.trim();
	}
	public String getNetworkid(){
		return this.networkid;
	}
	public void setNetworkid(String networkid){
		this.networkid = networkid == null ? null : networkid.trim();
	}
	public String getNetworkname(){
		return this.networkname;
	}
	public void setNetworkname(String networkname){
		this.networkname = networkname == null ? null : networkname.trim();
	}
	public Integer getVnum(){
		return this.vnum;
	}
	public void setVnum(Integer vnum){
		this.vnum = vnum;
	}
	public String getTaskdetails(){
		return this.taskdetails;
	}
	public void setTaskdetails(String taskdetails){
		this.taskdetails = taskdetails == null ? null : taskdetails.trim();
	}
	public Integer getAuditflag(){
		return this.auditflag;
	}
	public void setAuditflag(Integer auditflag){
		this.auditflag = auditflag;
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	
}