package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_case_class")
public class MgrCaseClass implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "caseid")
	private Integer caseid;// 案例ID
	
	@Column(name = "classid")
	private Integer classid;// 班级ID
	
	@Column(name = "last_update_id")
	private Integer lastUpdateId;// 最后更新人
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "last_update_time")
	private Date lastUpdateTime;// 最后更新时间
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getCaseid(){
		return this.caseid;
	}
	public void setCaseid(Integer caseid){
		this.caseid = caseid;
	}
	public Integer getClassid(){
		return this.classid;
	}
	public void setClassid(Integer classid){
		this.classid = classid;
	}
	public Integer getLastUpdateId(){
		return this.lastUpdateId;
	}
	public void setLastUpdateId(Integer lastUpdateId){
		this.lastUpdateId = lastUpdateId;
	}
	public Date getLastUpdateTime(){
		return this.lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime){
		this.lastUpdateTime = lastUpdateTime;
	}
	
}