package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "ex_paper_content")
public class ExPaperContent implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "des")
	private String des;// 内容类型描述
	
	@Column(name = "pid")
	private Integer pid;// 父级Id
	
	@Column(name = "quesid")
	private Integer quesid;// 试题Id
	
	@Column(name = "paperid")
	private Integer paperid;// 试卷Id
	
	@Column(name = "sort")
	private Integer sort;// 排序
	
	@Column(name = "score")
	private Integer score;// 分值
	
	@Column(name = "createby")
	private Integer createby;// 创建人
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 创建时间
	
	@Column(name = "updateby")
	private Integer updateby;// 更改人
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 更改时间
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getDes(){
		return this.des;
	}
	public void setDes(String des){
		this.des = des == null ? null : des.trim();
	}
	public Integer getPid(){
		return this.pid;
	}
	public void setPid(Integer pid){
		this.pid = pid;
	}
	public Integer getQuesid(){
		return this.quesid;
	}
	public void setQuesid(Integer quesid){
		this.quesid = quesid;
	}
	public Integer getPaperid(){
		return this.paperid;
	}
	public void setPaperid(Integer paperid){
		this.paperid = paperid;
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getScore(){
		return this.score;
	}
	public void setScore(Integer score){
		this.score = score;
	}
	public Integer getCreateby(){
		return this.createby;
	}
	public void setCreateby(Integer createby){
		this.createby = createby;
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	public Integer getUpdateby(){
		return this.updateby;
	}
	public void setUpdateby(Integer updateby){
		this.updateby = updateby;
	}
	public Date getUpdatedate(){
		return this.updatedate;
	}
	public void setUpdatedate(Date updatedate){
		this.updatedate = updatedate;
	}
	
}