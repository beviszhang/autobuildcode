package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_video_res")
public class MgrVideoRes implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "fileid")
	private Integer fileid;// 
	
	@Column(name = "videolab")
	private String videolab;// 视频标签
	
	@Column(name = "vname")
	private String vname;// 视频名称
	
	@Column(name = "vurl")
	private String vurl;// 视频路径
	
	@Column(name = "vresource")
	private String vresource;// 添加视频来源：视频库或具体从哪个课程添加
	
	@Column(name = "vpoint")
	private String vpoint;// 视频重点
	
	@Column(name = "tokinaga")
	private String tokinaga;// 时长
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 更新时间
	
	@Column(name = "updateby")
	private Integer updateby;// 用户ID
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getFileid(){
		return this.fileid;
	}
	public void setFileid(Integer fileid){
		this.fileid = fileid;
	}
	public String getVideolab(){
		return this.videolab;
	}
	public void setVideolab(String videolab){
		this.videolab = videolab == null ? null : videolab.trim();
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
	public String getVresource(){
		return this.vresource;
	}
	public void setVresource(String vresource){
		this.vresource = vresource == null ? null : vresource.trim();
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