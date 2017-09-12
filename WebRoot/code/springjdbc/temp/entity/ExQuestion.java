package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "ex_question")
public class ExQuestion implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "type_code")
	private Integer typeCode;// 类型（1：单选2.多选3.简答4：实验题）
	
	@Column(name = "type_name")
	private String typeName;// 类型名称
	
	@Column(name = "cate_one_id")
	private Integer cateOneId;// 一级分类(字典Id)
	
	@Column(name = "cate_two_id")
	private Integer cateTwoId;// 二级分类(字典Id)
	
	@Column(name = "network")
	private String network;// 网络
	
	@Column(name = "flavor")
	private String flavor;// 主机
	
	@Column(name = "mirror_image")
	private String mirrorImage;// 镜像
	
	@Column(name = "analysis")
	private String analysis;// 答案分析
	
	@Column(name = "answer")
	private String answer;// 正确答案
	
	@Column(name = "ques_describe")
	private String quesDescribe;// 题目描述
	
	@Column(name = "vnum")
	private Integer vnum;// 虚拟机的数量
	
	@Column(name = "test_content")
	private String testContent;// 实验文档的内容
	
	@Column(name = "bakfield")
	private String bakfield;// 备用字段
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "update_date")
	private Date updateDate;// 更改时间
	
	@Column(name = "update_by")
	private Integer updateBy;// 更改人
	
	@Column(name = "create_by")
	private Integer createBy;// 创建人
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "create_date")
	private Date createDate;// 创建时间
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getTypeCode(){
		return this.typeCode;
	}
	public void setTypeCode(Integer typeCode){
		this.typeCode = typeCode;
	}
	public String getTypeName(){
		return this.typeName;
	}
	public void setTypeName(String typeName){
		this.typeName = typeName == null ? null : typeName.trim();
	}
	public Integer getCateOneId(){
		return this.cateOneId;
	}
	public void setCateOneId(Integer cateOneId){
		this.cateOneId = cateOneId;
	}
	public Integer getCateTwoId(){
		return this.cateTwoId;
	}
	public void setCateTwoId(Integer cateTwoId){
		this.cateTwoId = cateTwoId;
	}
	public String getNetwork(){
		return this.network;
	}
	public void setNetwork(String network){
		this.network = network == null ? null : network.trim();
	}
	public String getFlavor(){
		return this.flavor;
	}
	public void setFlavor(String flavor){
		this.flavor = flavor == null ? null : flavor.trim();
	}
	public String getMirrorImage(){
		return this.mirrorImage;
	}
	public void setMirrorImage(String mirrorImage){
		this.mirrorImage = mirrorImage == null ? null : mirrorImage.trim();
	}
	public String getAnalysis(){
		return this.analysis;
	}
	public void setAnalysis(String analysis){
		this.analysis = analysis == null ? null : analysis.trim();
	}
	public String getAnswer(){
		return this.answer;
	}
	public void setAnswer(String answer){
		this.answer = answer == null ? null : answer.trim();
	}
	public String getQuesDescribe(){
		return this.quesDescribe;
	}
	public void setQuesDescribe(String quesDescribe){
		this.quesDescribe = quesDescribe == null ? null : quesDescribe.trim();
	}
	public Integer getVnum(){
		return this.vnum;
	}
	public void setVnum(Integer vnum){
		this.vnum = vnum;
	}
	public String getTestContent(){
		return this.testContent;
	}
	public void setTestContent(String testContent){
		this.testContent = testContent == null ? null : testContent.trim();
	}
	public String getBakfield(){
		return this.bakfield;
	}
	public void setBakfield(String bakfield){
		this.bakfield = bakfield == null ? null : bakfield.trim();
	}
	public Date getUpdateDate(){
		return this.updateDate;
	}
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	public Integer getUpdateBy(){
		return this.updateBy;
	}
	public void setUpdateBy(Integer updateBy){
		this.updateBy = updateBy;
	}
	public Integer getCreateBy(){
		return this.createBy;
	}
	public void setCreateBy(Integer createBy){
		this.createBy = createBy;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	
}