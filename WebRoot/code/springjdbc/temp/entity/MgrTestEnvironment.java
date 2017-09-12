package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_test_environment")
public class MgrTestEnvironment implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// id
	
	@Column(name = "environment")
	private String environment;// 实验环境名
	
	@Column(name = "remark")
	private String remark;// 备注
	
	@Column(name = "iscluster")
	private Integer iscluster;// 是否为集群环境：0、否，1、是
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 更新时间
	
	@Column(name = "updateby")
	private Integer updateby;// 更新人
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getEnvironment(){
		return this.environment;
	}
	public void setEnvironment(String environment){
		this.environment = environment == null ? null : environment.trim();
	}
	public String getRemark(){
		return this.remark;
	}
	public void setRemark(String remark){
		this.remark = remark == null ? null : remark.trim();
	}
	public Integer getIscluster(){
		return this.iscluster;
	}
	public void setIscluster(Integer iscluster){
		this.iscluster = iscluster;
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