package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "chart_project")
public class ChartProject implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "projectname")
	private String projectname;// 
	
	@Column(name = "industry")
	private String industry;// 
	
	@Column(name = "projectdesc")
	private String projectdesc;// 
	
	@Column(name = "theme")
	private String theme;// 
	
	@Column(name = "userid")
	private Integer userid;// 
	
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
	public String getProjectname(){
		return this.projectname;
	}
	public void setProjectname(String projectname){
		this.projectname = projectname == null ? null : projectname.trim();
	}
	public String getIndustry(){
		return this.industry;
	}
	public void setIndustry(String industry){
		this.industry = industry == null ? null : industry.trim();
	}
	public String getProjectdesc(){
		return this.projectdesc;
	}
	public void setProjectdesc(String projectdesc){
		this.projectdesc = projectdesc == null ? null : projectdesc.trim();
	}
	public String getTheme(){
		return this.theme;
	}
	public void setTheme(String theme){
		this.theme = theme == null ? null : theme.trim();
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	
}