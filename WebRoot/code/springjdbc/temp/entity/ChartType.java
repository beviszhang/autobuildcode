package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "chart_type")
public class ChartType implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "projectid")
	private Integer projectid;// 
	
	@Column(name = "typename")
	private String typename;// 
	
	@Column(name = "typeicon")
	private String typeicon;// 
	
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
	public Integer getProjectid(){
		return this.projectid;
	}
	public void setProjectid(Integer projectid){
		this.projectid = projectid;
	}
	public String getTypename(){
		return this.typename;
	}
	public void setTypename(String typename){
		this.typename = typename == null ? null : typename.trim();
	}
	public String getTypeicon(){
		return this.typeicon;
	}
	public void setTypeicon(String typeicon){
		this.typeicon = typeicon == null ? null : typeicon.trim();
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	
}