package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_user")
public class TbUser implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "classid")
	private Integer classid;// 所属班级Id
	
	@Column(name = "username")
	private String username;// 用户名
	
	@Column(name = "stuno")
	private String stuno;// 学号
	
	@Column(name = "password")
	private String password;// 密码
	
	@Column(name = "realname")
	private String realname;// 真实姓名
	
	@Column(name = "signature")
	private String signature;// 个性签名
	
	@Column(name = "photo")
	private String photo;// 头像
	
	@Column(name = "mobile")
	private String mobile;// 移动电话
	
	@Column(name = "email")
	private String email;// 邮箱地址
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 
	
	@Column(name = "updateby")
	private Integer updateby;// 
	
	@Column(name = "role")
	private Integer role;// 角色1:管理员 2：教师 3：学生
	
	@Column(name = "state")
	private Integer state;// 用户状态 1有效 0 无效
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 
	
	@Column(name = "createby")
	private Integer createby;// 
	
		@DateTimeFormat(pattern = "yyyy-MM-dd")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "overdate")
	private Date overdate;// 过期日期
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getClassid(){
		return this.classid;
	}
	public void setClassid(Integer classid){
		this.classid = classid;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username == null ? null : username.trim();
	}
	public String getStuno(){
		return this.stuno;
	}
	public void setStuno(String stuno){
		this.stuno = stuno == null ? null : stuno.trim();
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password == null ? null : password.trim();
	}
	public String getRealname(){
		return this.realname;
	}
	public void setRealname(String realname){
		this.realname = realname == null ? null : realname.trim();
	}
	public String getSignature(){
		return this.signature;
	}
	public void setSignature(String signature){
		this.signature = signature == null ? null : signature.trim();
	}
	public String getPhoto(){
		return this.photo;
	}
	public void setPhoto(String photo){
		this.photo = photo == null ? null : photo.trim();
	}
	public String getMobile(){
		return this.mobile;
	}
	public void setMobile(String mobile){
		this.mobile = mobile == null ? null : mobile.trim();
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email == null ? null : email.trim();
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
	public Integer getRole(){
		return this.role;
	}
	public void setRole(Integer role){
		this.role = role;
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
	public Date getOverdate(){
		return this.overdate;
	}
	public void setOverdate(Date overdate){
		this.overdate = overdate;
	}
	
}