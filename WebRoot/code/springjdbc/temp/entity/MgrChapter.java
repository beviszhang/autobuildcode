package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_chapter")
public class MgrChapter implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private BigInteger id;// 
	
	@Column(name = "chaptername")
	private String chaptername;// 章节名称
	
	@Column(name = "chaptercontent")
	private String chaptercontent;// 章节内容
	
	@Column(name = "chapterlabel")
	private String chapterlabel;// 章节标签
	
	@Column(name = "courseid")
	private Integer courseid;// 课程Id
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 
	
	@Column(name = "updateby")
	private Integer updateby;// 修改人
	

	 

	/*#####################get  and  set#####################*/
	
	public BigInteger getId(){
		return this.id;
	}
	public void setId(BigInteger id){
		this.id = id;
	}
	public String getChaptername(){
		return this.chaptername;
	}
	public void setChaptername(String chaptername){
		this.chaptername = chaptername == null ? null : chaptername.trim();
	}
	public String getChaptercontent(){
		return this.chaptercontent;
	}
	public void setChaptercontent(String chaptercontent){
		this.chaptercontent = chaptercontent == null ? null : chaptercontent.trim();
	}
	public String getChapterlabel(){
		return this.chapterlabel;
	}
	public void setChapterlabel(String chapterlabel){
		this.chapterlabel = chapterlabel == null ? null : chapterlabel.trim();
	}
	public Integer getCourseid(){
		return this.courseid;
	}
	public void setCourseid(Integer courseid){
		this.courseid = courseid;
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