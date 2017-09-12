package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "chart_table")
public class ChartTable implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "chartname")
	private String chartname;// 
	
	@Column(name = "dataid")
	private Integer dataid;// 
	
	@Column(name = "chartdesc")
	private String chartdesc;// 
	
	@Column(name = "userid")
	private Integer userid;// 
	
	@Column(name = "charttype")
	private String charttype;// 
	
	@Column(name = "xfiled")
	private String xfiled;// 
	
	@Column(name = "yfiled")
	private String yfiled;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 
	
	@Column(name = "chartdata")
	private String chartdata;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getChartname(){
		return this.chartname;
	}
	public void setChartname(String chartname){
		this.chartname = chartname == null ? null : chartname.trim();
	}
	public Integer getDataid(){
		return this.dataid;
	}
	public void setDataid(Integer dataid){
		this.dataid = dataid;
	}
	public String getChartdesc(){
		return this.chartdesc;
	}
	public void setChartdesc(String chartdesc){
		this.chartdesc = chartdesc == null ? null : chartdesc.trim();
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public String getCharttype(){
		return this.charttype;
	}
	public void setCharttype(String charttype){
		this.charttype = charttype == null ? null : charttype.trim();
	}
	public String getXfiled(){
		return this.xfiled;
	}
	public void setXfiled(String xfiled){
		this.xfiled = xfiled == null ? null : xfiled.trim();
	}
	public String getYfiled(){
		return this.yfiled;
	}
	public void setYfiled(String yfiled){
		this.yfiled = yfiled == null ? null : yfiled.trim();
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	public String getChartdata(){
		return this.chartdata;
	}
	public void setChartdata(String chartdata){
		this.chartdata = chartdata == null ? null : chartdata.trim();
	}
	
}