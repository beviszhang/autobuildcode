package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_video")
public class MgrVideo implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "videoresid")
	private Integer videoresid;// 视频资源Id
	
	@Column(name = "chapterid")
	private Integer chapterid;// 章节Id
	
	@Column(name = "vname")
	private String vname;// 视频名称
	
	@Column(name = "vurl")
	private String vurl;// 视频路径
	
	@Column(name = "vpoint")
	private String vpoint;// 视频重点
	
	@Column(name = "tokinaga")
	private String tokinaga;// 时长
	
	@Column(name = "sort")
	private Integer sort;// 
	
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
	public Integer getVideoresid(){
		return this.videoresid;
	}
	public void setVideoresid(Integer videoresid){
		this.videoresid = videoresid;
	}
	public Integer getChapterid(){
		return this.chapterid;
	}
	public void setChapterid(Integer chapterid){
		this.chapterid = chapterid;
	}
	public String getVname(){
		return this.vname;
	}
	public void setVname(String vname){
		this.vname = vname == null ? null : vname.trim();
	}
	public String getVurl(){
		return this.vurl;
	}
	public void setVurl(String vurl){
		this.vurl = vurl == null ? null : vurl.trim();
	}
	public String getVpoint(){
		return this.vpoint;
	}
	public void setVpoint(String vpoint){
		this.vpoint = vpoint == null ? null : vpoint.trim();
	}
	public String getTokinaga(){
		return this.tokinaga;
	}
	public void setTokinaga(String tokinaga){
		this.tokinaga = tokinaga == null ? null : tokinaga.trim();
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort = sort;
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