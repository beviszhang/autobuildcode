package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_data_market")
public class TbDataMarket implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "dataname")
	private String dataname;// 
	
	@Column(name = "datadesc")
	private String datadesc;// 
	
	@Column(name = "datatype")
	private String datatype;// 
	
	@Column(name = "datasize")
	private Double datasize;// 
	
	@Column(name = "datalabel")
	private String datalabel;// 
	
	@Column(name = "datasource")
	private Integer datasource;// 
	
	@Column(name = "datapic")
	private String datapic;// 
	
	@Column(name = "fileid")
	private Integer fileid;// 
	
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
	public String getDatatype(){
		return this.datatype;
	}
	public void setDatatype(String datatype){
		this.datatype = datatype == null ? null : datatype.trim();
	}
	public Double getDatasize(){
		return this.datasize;
	}
	public void setDatasize(Double datasize){
		this.datasize = datasize;
	}
	public String getDatalabel(){
		return this.datalabel;
	}
	public void setDatalabel(String datalabel){
		this.datalabel = datalabel == null ? null : datalabel.trim();
	}
	public Integer getDatasource(){
		return this.datasource;
	}
	public void setDatasource(Integer datasource){
		this.datasource = datasource;
	}
	public String getDatapic(){
		return this.datapic;
	}
	public void setDatapic(String datapic){
		this.datapic = datapic == null ? null : datapic.trim();
	}
	public Integer getFileid(){
		return this.fileid;
	}
	public void setFileid(Integer fileid){
		this.fileid = fileid;
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