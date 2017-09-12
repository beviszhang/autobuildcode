package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_case")
public class MgrCase implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "casename")
	private String casename;// 案例名称
	
	@Column(name = "casedesc")
	private String casedesc;// 案例介绍
	
	@Column(name = "image")
	private String image;// 镜像
	
	@Column(name = "flavor")
	private String flavor;// 主机类型
	
	@Column(name = "network")
	private String network;// 网络
	
	@Column(name = "vncnum")
	private Integer vncnum;// 虚拟机数量
	
	@Column(name = "publishflag")
	private Integer publishflag;// 发布标识
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "publishdate")
	private Date publishdate;// 发布日期
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 创建日期
	
	@Column(name = "updateid")
	private Integer updateid;// 更新人
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 更新日期
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getCasename(){
		return this.casename;
	}
	public void setCasename(String casename){
		this.casename = casename == null ? null : casename.trim();
	}
	public String getCasedesc(){
		return this.casedesc;
	}
	public void setCasedesc(String casedesc){
		this.casedesc = casedesc == null ? null : casedesc.trim();
	}
	public String getImage(){
		return this.image;
	}
	public void setImage(String image){
		this.image = image == null ? null : image.trim();
	}
	public String getFlavor(){
		return this.flavor;
	}
	public void setFlavor(String flavor){
		this.flavor = flavor == null ? null : flavor.trim();
	}
	public String getNetwork(){
		return this.network;
	}
	public void setNetwork(String network){
		this.network = network == null ? null : network.trim();
	}
	public Integer getVncnum(){
		return this.vncnum;
	}
	public void setVncnum(Integer vncnum){
		this.vncnum = vncnum;
	}
	public Integer getPublishflag(){
		return this.publishflag;
	}
	public void setPublishflag(Integer publishflag){
		this.publishflag = publishflag;
	}
	public Date getPublishdate(){
		return this.publishdate;
	}
	public void setPublishdate(Date publishdate){
		this.publishdate = publishdate;
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	public Integer getUpdateid(){
		return this.updateid;
	}
	public void setUpdateid(Integer updateid){
		this.updateid = updateid;
	}
	public Date getUpdatedate(){
		return this.updatedate;
	}
	public void setUpdatedate(Date updatedate){
		this.updatedate = updatedate;
	}
	
}