package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "topic_reply")
public class TopicReply implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "mainid")
	private Integer mainid;// 主贴Id
	
	@Column(name = "replyid")
	private Integer replyid;// 回复Id
	
	@Column(name = "content")
	private String content;// 内容
	
	@Column(name = "likenum")
	private Integer likenum;// 点赞数
	
	@Column(name = "rightflag")
	private Integer rightflag;// 是否是正确答案
	
	@Column(name = "userid")
	private Integer userid;// 创建人
	
	@Column(name = "username")
	private String username;// 创建人姓名
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 创建时间
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getMainid(){
		return this.mainid;
	}
	public void setMainid(Integer mainid){
		this.mainid = mainid;
	}
	public Integer getReplyid(){
		return this.replyid;
	}
	public void setReplyid(Integer replyid){
		this.replyid = replyid;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content == null ? null : content.trim();
	}
	public Integer getLikenum(){
		return this.likenum;
	}
	public void setLikenum(Integer likenum){
		this.likenum = likenum;
	}
	public Integer getRightflag(){
		return this.rightflag;
	}
	public void setRightflag(Integer rightflag){
		this.rightflag = rightflag;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username == null ? null : username.trim();
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	
}