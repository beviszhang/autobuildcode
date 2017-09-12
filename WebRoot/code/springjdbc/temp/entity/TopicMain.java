package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "topic_main")
public class TopicMain implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "typeid")
	private Integer typeid;// 分类Id
	
	@Column(name = "title")
	private String title;// 标题
	
	@Column(name = "content")
	private String content;// 内容
	
	@Column(name = "userid")
	private Integer userid;// 创建人
	
	@Column(name = "username")
	private String username;// 创建人姓名
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 创建时间
	
	@Column(name = "replynum")
	private Integer replynum;// 回复数
	
	@Column(name = "likenum")
	private Integer likenum;// 点赞数
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getTypeid(){
		return this.typeid;
	}
	public void setTypeid(Integer typeid){
		this.typeid = typeid;
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title == null ? null : title.trim();
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content == null ? null : content.trim();
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
	public Integer getReplynum(){
		return this.replynum;
	}
	public void setReplynum(Integer replynum){
		this.replynum = replynum;
	}
	public Integer getLikenum(){
		return this.likenum;
	}
	public void setLikenum(Integer likenum){
		this.likenum = likenum;
	}
	
}