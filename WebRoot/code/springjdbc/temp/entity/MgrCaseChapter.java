package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "mgr_case_chapter")
public class MgrCaseChapter implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "caseid")
	private Integer caseid;// 案例ID
	
	@Column(name = "chaptername")
	private String chaptername;// 章节名称
	
	@Column(name = "sort")
	private Integer sort;// 排序
	
	@Column(name = "type")
	private Integer type;// 模版类型:1项目概要,2需求分析,3解决方案,4准备工作,5数据采集.6数据清洗,7数据存储8数据计算9数据可视化10自定义
            
	
	@Column(name = "state")
	private Integer state;// 状态
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "updatedate")
	private Date updatedate;// 更新时间
	
	@Column(name = "updateby")
	private Integer updateby;// 更新人
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getCaseid(){
		return this.caseid;
	}
	public void setCaseid(Integer caseid){
		this.caseid = caseid;
	}
	public String getChaptername(){
		return this.chaptername;
	}
	public void setChaptername(String chaptername){
		this.chaptername = chaptername == null ? null : chaptername.trim();
	}
	public Integer getSort(){
		return this.sort;
	}
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Integer getType(){
		return this.type;
	}
	public void setType(Integer type){
		this.type = type;
	}
	public Integer getState(){
		return this.state;
	}
	public void setState(Integer state){
		this.state = state;
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