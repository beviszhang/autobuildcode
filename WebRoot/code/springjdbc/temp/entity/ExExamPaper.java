package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "ex_exam_paper")
public class ExExamPaper implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "papername")
	private String papername;// 试卷名称
	
	@Column(name = "typecode")
	private Integer typecode;// 考试形式（1：课程考试2：统一考试）
	
	@Column(name = "answertime")
	private Integer answertime;// 答题时间(分钟）
	
	@Column(name = "paperdesc")
	private String paperdesc;// 试卷描述
	
	@Column(name = "cateoneid")
	private Integer cateoneid;// 一级分类(字典Id)
	
	@Column(name = "catetwoid")
	private Integer catetwoid;// 二级分类(字典Id)
	
	@Column(name = "papercount")
	private Integer papercount;// 试卷题目总数
	
	@Column(name = "totalscore")
	private Integer totalscore;// 总分值
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "begindate")
	private Date begindate;// 开始考试时间
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "enddate")
	private Date enddate;// 
	
	@Column(name = "publishflag")
	private Integer publishflag;// 状态（0：未发布 1：已发布）
	
	@Column(name = "bakfield")
	private String bakfield;// 备用字段
	
	@Column(name = "hwnum")
	private Integer hwnum;// 作业练习数量
	
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
	public String getPapername(){
		return this.papername;
	}
	public void setPapername(String papername){
		this.papername = papername == null ? null : papername.trim();
	}
	public Integer getTypecode(){
		return this.typecode;
	}
	public void setTypecode(Integer typecode){
		this.typecode = typecode;
	}
	public Integer getAnswertime(){
		return this.answertime;
	}
	public void setAnswertime(Integer answertime){
		this.answertime = answertime;
	}
	public String getPaperdesc(){
		return this.paperdesc;
	}
	public void setPaperdesc(String paperdesc){
		this.paperdesc = paperdesc == null ? null : paperdesc.trim();
	}
	public Integer getCateoneid(){
		return this.cateoneid;
	}
	public void setCateoneid(Integer cateoneid){
		this.cateoneid = cateoneid;
	}
	public Integer getCatetwoid(){
		return this.catetwoid;
	}
	public void setCatetwoid(Integer catetwoid){
		this.catetwoid = catetwoid;
	}
	public Integer getPapercount(){
		return this.papercount;
	}
	public void setPapercount(Integer papercount){
		this.papercount = papercount;
	}
	public Integer getTotalscore(){
		return this.totalscore;
	}
	public void setTotalscore(Integer totalscore){
		this.totalscore = totalscore;
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
	public Integer getPublishflag(){
		return this.publishflag;
	}
	public void setPublishflag(Integer publishflag){
		this.publishflag = publishflag;
	}
	public String getBakfield(){
		return this.bakfield;
	}
	public void setBakfield(String bakfield){
		this.bakfield = bakfield == null ? null : bakfield.trim();
	}
	public Integer getHwnum(){
		return this.hwnum;
	}
	public void setHwnum(Integer hwnum){
		this.hwnum = hwnum;
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