package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "ex_chap_paper")
public class ExChapPaper implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "courseid")
	private Integer courseid;// 课程id
	
	@Column(name = "chapid")
	private Integer chapid;// 章节Id
	
	@Column(name = "paperid")
	private Integer paperid;// 试卷Id
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 更改时间
	
	@Column(name = "updateby")
	private Integer updateby;// 更改人
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid = courseid;
	}
	public Integer getChapid(){
		return this.chapid;
	}
	public void setChapid(Integer chapid){
		this.chapid = chapid;
	}
	public Integer getPaperid(){
		return this.paperid;
	}
	public void setPaperid(Integer paperid){
		this.paperid = paperid;
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