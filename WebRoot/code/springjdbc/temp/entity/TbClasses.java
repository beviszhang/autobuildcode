package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_classes")
public class TbClasses implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "classname")
	private String classname;// 班级名称
	
	@Column(name = "classcode")
	private String classcode;// 
	
	@Column(name = "orgid")
	private Integer orgid;// 专业id
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 
	
	@Column(name = "updateby")
	private Integer updateby;// 
	
	@Column(name = "leadflag")
	private Integer leadflag;// 导入标志  0：不是  1：是
	
	@Column(name = "state")
	private Integer state;// 状态 1 正常 0 停用
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 创建时间
	
	@Column(name = "createby")
	private Integer createby;// 创建人
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getClassname(){
		return this.classname;
	}
	public void setClassname(String classname){
		this.classname = classname == null ? null : classname.trim();
	}
	public String getClasscode(){
		return this.classcode;
	}
	public void setClasscode(String classcode){
		this.classcode = classcode == null ? null : classcode.trim();
	}
	public Integer getOrgid(){
		return this.orgid;
	}
	public void setOrgid(Integer orgid){
		this.orgid = orgid;
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
	public Integer getLeadflag(){
		return this.leadflag;
	}
	public void setLeadflag(Integer leadflag){
		this.leadflag = leadflag;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state = state;
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	public Integer getCreateby(){
		return this.createby;
	}
	public void setCreateby(Integer createby){
		this.createby = createby;
	}
	
}