package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "ex_option")
public class ExOption implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "opt_detail")
	private String optDetail;// 选项描述
	
	@Column(name = "opt_code")
	private String optCode;// 选项字母（A,或者B或者C或者D）
	
	@Column(name = "ques_id")
	private Integer quesId;// 问题的id
	
	@Column(name = "create_by")
	private Integer createBy;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "create_date")
	private Date createDate;// 
	
	@Column(name = "update_by")
	private Integer updateBy;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "update_date")
	private Date updateDate;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getOptDetail(){
		return this.optDetail;
	}
	public void setOptDetail(String optDetail){
		this.optDetail = optDetail == null ? null : optDetail.trim();
	}
	public String getOptCode(){
		return this.optCode;
	}
	public void setOptCode(String optCode){
		this.optCode = optCode == null ? null : optCode.trim();
	}
	public Integer getQuesId(){
		return this.quesId;
	}
	public void setQuesId(Integer quesId){
		this.quesId = quesId;
	}
	public Integer getCreateBy(){
		return this.createBy;
	}
	public void setCreateBy(Integer createBy){
		this.createBy = createBy;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	public Integer getUpdateBy(){
		return this.updateBy;
	}
	public void setUpdateBy(Integer updateBy){
		this.updateBy = updateBy;
	}
	public Date getUpdateDate(){
		return this.updateDate;
	}
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	
}