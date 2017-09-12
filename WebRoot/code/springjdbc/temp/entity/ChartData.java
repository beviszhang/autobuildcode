package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "chart_data")
public class ChartData implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 主键
	
	@Column(name = "dataname")
	private String dataname;// 数据名称
	
	@Column(name = "datadesc")
	private String datadesc;// 
	
	@Column(name = "path")
	private String path;// 
	
	@Column(name = "datalength")
	private Integer datalength;// 
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "createdate")
	private Date createdate;// 
	
	@Column(name = "userid")
	private Integer userid;// 
	
	@Column(name = "source")
	private String source;// 数据源
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getDataname(){
		return this.dataname;
	}
	public void setDataname(String dataname){
		this.dataname = dataname == null ? null : dataname.trim();
	}
	public String getDatadesc(){
		return this.datadesc;
	}
	public void setDatadesc(String datadesc){
		this.datadesc = datadesc == null ? null : datadesc.trim();
	}
	public String getPath(){
		return this.path;
	}
	public void setPath(String path){
		this.path = path == null ? null : path.trim();
	}
	public Integer getDatalength(){
		return this.datalength;
	}
	public void setDatalength(Integer datalength){
		this.datalength = datalength;
	}
	public Date getCreatedate(){
		return this.createdate;
	}
	public void setCreatedate(Date createdate){
		this.createdate = createdate;
	}
	public Integer getUserid(){
		return this.userid;
	}
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	public String getSource(){
		return this.source;
	}
	public void setSource(String source){
		this.source = source == null ? null : source.trim();
	}
	
}