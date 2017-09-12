package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "topic_user_reply")
public class TopicUserReply implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@Column(name = "replyid")
	private Integer replyid;// 回复Id
	
	@Column(name = "userid")
	private Integer userid;// 创建人
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getReplyid(){
		return this.replyid;
	}
	public void setReplyid(Integer replyid){
		this.replyid = replyid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	
}