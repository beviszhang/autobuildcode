package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_test_image")
public class MgrTestImage implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// id
	
	@Column(name = "testid")
	private Integer testid;// 实验环境Id
	
	@Column(name = "image")
	private String image;// 对应镜像
	
	@Column(name = "type")
	private Integer type;// 镜像对应虚机类型（0：无集群1:主2：从）
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 修改时间
	
	@Column(name = "updateby")
	private Integer updateby;// 修改人
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getTestid(){
		return this.testid;
	}
	public void setTestid(Integer testid){
		this.testid = testid;
	}
	public String getImage(){
		return this.image;
	}
	public void setImage(String image){
		this.image = image == null ? null : image.trim();
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type = type;
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