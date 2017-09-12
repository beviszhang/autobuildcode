package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_course_info")
public class MgrCourseInfo implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "coursename")
	private String coursename;// 课程名称
	
	@Column(name = "coursecla")
	private Integer coursecla;// 课程分类--字典id
	
	@Column(name = "coursesub")
	private String coursesub;// 学科--多个字典id，每个学科用，分割
	
	@Column(name = "coursetype")
	private String coursetype;// 课程类型
	
	@Column(name = "imagename")
	private String imagename;// 实验课程-镜像名称
	
	@Column(name = "flavortype")
	private String flavortype;// 实验课程---主机类型
	
	@Column(name = "connnetwork")
	private String connnetwork;// 实验课程---连接网络：多个，用，分割
	
	@Column(name = "vmnum")
	private Integer vmnum;// 实验课程--虚拟机数量
	
	@Column(name = "disk")
	private String disk;// 实验课程--额外硬盘大小 10G 20G
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "begindate")
	private Date begindate;// 课程开始时间
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "enddate")
	private Date enddate;// 课程结束时间
	
	@Column(name = "coursepic")
	private String coursepic;// 课程图片地址
	
	@Column(name = "applyperson")
	private String applyperson;// 适用人群
	
	@Column(name = "target")
	private String target;// 课程目标
	
	@Column(name = "content")
	private String content;// 课程内容
	
	@Column(name = "issale")
	private Integer issale;// 是否售卖  0： 否  1：是
	
	@Column(name = "price")
	private Double price;// 售卖价格
	
	@Column(name = "templateflag")
	private Integer templateflag;// 标识是否为模板课程
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 
	
	@Column(name = "updateby")
	private Integer updateby;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 创建日期
	
	@Column(name = "playnum")
	private BigInteger playnum;// 播放次数
	
	@Column(name = "publishflag")
	private Integer publishflag;// 发布标志： 0：未发布   1：已发布
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "publishdate")
	private Date publishdate;// 发布时间
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getCoursename(){
		return this.coursename;
	}
	public void setCoursename(String coursename){
		this.coursename = coursename == null ? null : coursename.trim();
	}
	public Integer getCoursecla(){
		return this.coursecla;
	}
	public void setCoursecla(Integer coursecla){
		this.coursecla = coursecla;
	}
	public String getCoursesub(){
		return this.coursesub;
	}
	public void setCoursesub(String coursesub){
		this.coursesub = coursesub == null ? null : coursesub.trim();
	}
	public String getCoursetype(){
		return this.coursetype;
	}
	public void setCoursetype(String coursetype){
		this.coursetype = coursetype == null ? null : coursetype.trim();
	}
	public String getImagename(){
		return this.imagename;
	}
	public void setImagename(String imagename){
		this.imagename = imagename == null ? null : imagename.trim();
	}
	public String getFlavortype(){
		return this.flavortype;
	}
	public void setFlavortype(String flavortype){
		this.flavortype = flavortype == null ? null : flavortype.trim();
	}
	public String getConnnetwork(){
		return this.connnetwork;
	}
	public void setConnnetwork(String connnetwork){
		this.connnetwork = connnetwork == null ? null : connnetwork.trim();
	}
	public Integer getVmnum(){
		return this.vmnum;
	}
	public void setVmnum(Integer vmnum){
		this.vmnum = vmnum;
	}
	public String getDisk(){
		return this.disk;
	}
	public void setDisk(String disk){
		this.disk = disk == null ? null : disk.trim();
	}
	public Date getBegindate(){
		return this.begindate;
	}
	public void setBegindate(Date begindate){
		this.begindate = begindate;
	}
	public Date getEnddate(){
		return this.enddate;
	}
	public void setEnddate(Date enddate){
		this.enddate = enddate;
	}
	public String getCoursepic(){
		return this.coursepic;
	}
	public void setCoursepic(String coursepic){
		this.coursepic = coursepic == null ? null : coursepic.trim();
	}
	public String getApplyperson(){
		return this.applyperson;
	}
	public void setApplyperson(String applyperson){
		this.applyperson = applyperson == null ? null : applyperson.trim();
	}
	public String getTarget(){
		return this.target;
	}
	public void setTarget(String target){
		this.target = target == null ? null : target.trim();
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content == null ? null : content.trim();
	}
	public Integer getIssale(){
		return this.issale;
	}
	public void setIssale(Integer issale){
		this.issale = issale;
	}
	public Double getPrice(){
		return this.price;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public Integer getTemplateflag(){
		return this.templateflag;
	}
	public void setTemplateflag(Integer templateflag){
		this.templateflag = templateflag;
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
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	public BigInteger getPlaynum(){
		return this.playnum;
	}
	public void setPlaynum(BigInteger playnum){
		this.playnum = playnum;
	}
	public Integer getPublishflag(){
		return this.publishflag;
	}
	public void setPublishflag(Integer publishflag){
		this.publishflag = publishflag;
	}
	public Date getPublishdate(){
		return this.publishdate;
	}
	public void setPublishdate(Date publishdate){
		this.publishdate = publishdate;
	}
	
}