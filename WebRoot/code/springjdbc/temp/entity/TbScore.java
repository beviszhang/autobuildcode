package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_score")
public class TbScore implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "couseid")
	private Integer couseid;// 课程Id
	
	@Column(name = "chapterid")
	private Integer chapterid;// 章节Id
	
	@Column(name = "docid")
	private Integer docid;// 实验文档Id
	
	@Column(name = "userid")
	private Integer userid;// 学生Id
	
	@Column(name = "classid")
	private Integer classid;// 班级Id
	
	@Column(name = "score")
	private Double score;// 分数
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 
	
	@Column(name = "updateby")
	private Integer updateby;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getCouseid(){
		return this.couseid;
	}
	public void setCouseid(Integer couseid){
		this.couseid = couseid;
	}
	public Integer getChapterid(){
		return this.chapterid;
	}
	public void setChapterid(Integer chapterid){
		this.chapterid = chapterid;
	}
	public Integer getDocid(){
		return this.docid;
	}
	public void setDocid(Integer docid){
		this.docid = docid;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public Integer getClassid(){
		return this.classid;
	}
	public void setClassid(Integer classid){
		this.classid = classid;
	}
	public Double getScore(){
		return this.score;
	}
	public void setScore(Double score){
		this.score = score;
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