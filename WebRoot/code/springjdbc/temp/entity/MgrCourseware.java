package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_courseware")
public class MgrCourseware implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "courseid")
	private Integer courseid;// 
	
	@Column(name = "cwname")
	private String cwname;// 
	
	@Column(name = "cwuname")
	private String cwuname;// 
	
	@Column(name = "cwdesc")
	private String cwdesc;// 
	
	@Column(name = "cwtype")
	private String cwtype;// 
	
	@Column(name = "cwsize")
	private Double cwsize;// 
	
	@Column(name = "path")
	private String path;// 
	
	@Column(name = "sort")
	private Integer sort;// 
	
	@Column(name = "cwresid")
	private Integer cwresid;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 
	
	@Column(name = "updateby")
	private Integer updateby;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid = courseid;
	}
	public String getCwname(){
		return this.cwname;
	}
	public void setCwname(String cwname){
		this.cwname = cwname == null ? null : cwname.trim();
	}
	public String getCwuname(){
		return this.cwuname;
	}
	public void setCwuname(String cwuname){
		this.cwuname = cwuname == null ? null : cwuname.trim();
	}
	public String getCwdesc(){
		return this.cwdesc;
	}
	public void setCwdesc(String cwdesc){
		this.cwdesc = cwdesc == null ? null : cwdesc.trim();
	}
	public String getCwtype(){
		return this.cwtype;
	}
	public void setCwtype(String cwtype){
		this.cwtype = cwtype == null ? null : cwtype.trim();
	}
	public Double getCwsize(){
		return this.cwsize;
	}
	public void setCwsize(Double cwsize){
		this.cwsize = cwsize;
	}
	public String getPath(){
		return this.path;
	}
	public void setPath(String path){
		this.path = path == null ? null : path.trim();
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getCwresid(){
		return this.cwresid;
	}
	public void setCwresid(Integer cwresid){
		this.cwresid = cwresid;
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
	
}