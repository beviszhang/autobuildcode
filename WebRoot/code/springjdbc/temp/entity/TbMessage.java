package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_message")
public class TbMessage implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "sendid")
	private Integer sendid;// 发送者ID
	
	@Column(name = "receiveid")
	private Integer receiveid;// 接收者ID
	
	@Column(name = "mcontent")
	private String mcontent;// 消息内容详情
	
	@Column(name = "title")
	private Integer title;// 101：申请课程；102：实验报告；201:老师审核通过;202不通过; 203:实验报告已审核 204:催交
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "mdate")
	private Date mdate;// 时间
	
	@Column(name = "courseid")
	private Integer courseid;// 课程ID
	
	@Column(name = "status")
	private Integer status;// 0:未读   1：已读
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getSendid(){
		return this.sendid;
	}
	public void setSendid(Integer sendid){
		this.sendid = sendid;
	}
	public Integer getReceiveid(){
		return this.receiveid;
	}
	public void setReceiveid(Integer receiveid){
		this.receiveid = receiveid;
	}
	public String getMcontent(){
		return this.mcontent;
	}
	public void setMcontent(String mcontent){
		this.mcontent = mcontent == null ? null : mcontent.trim();
	}
	public Integer getTitle(){
		return this.title;
	}
	public void setTitle(Integer title){
		this.title = title;
	}
	public Date getMdate(){
		return this.mdate;
	}
	public void setMdate(Date mdate){
		this.mdate = mdate;
	}
	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid = courseid;
	}
	public Integer getStatus(){
		return this.status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	
}