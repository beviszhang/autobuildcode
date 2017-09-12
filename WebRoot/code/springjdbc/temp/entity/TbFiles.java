package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_files")
public class TbFiles implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "fileid")
	private Integer fileid;// 文件Id
	
	@Column(name = "uname")
	private String uname;// 格式化后的名字
	
	@Column(name = "filename")
	private String filename;// 文件名
	
	@Column(name = "fileext")
	private String fileext;// 文件点缀或者格式
	
	@Column(name = "filepath")
	private String filepath;// 文件路径
	
	@Column(name = "size")
	private Integer size;// 文件大小
	
		@DateTimeFormat(pattern = "yyyy-MM-dd")// 存储日期时使用
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")// 查询日期时使用
	@Column(name = "pdate")
	private Date pdate;// 创建日期
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getFileid(){
		return this.fileid;
	}
	public void setFileid(Integer fileid){
		this.fileid = fileid;
	}
	public String getUname(){
		return this.uname;
	}
	public void setUname(String uname){
		this.uname = uname == null ? null : uname.trim();
	}
	public String getFilename(){
		return this.filename;
	}
	public void setFilename(String filename){
		this.filename = filename == null ? null : filename.trim();
	}
	public String getFileext(){
		return this.fileext;
	}
	public void setFileext(String fileext){
		this.fileext = fileext == null ? null : fileext.trim();
	}
	public String getFilepath(){
		return this.filepath;
	}
	public void setFilepath(String filepath){
		this.filepath = filepath == null ? null : filepath.trim();
	}
	public Integer getSize(){
		return this.size;
	}
	public void setSize(Integer size){
		this.size = size;
	}
	public Date getPdate(){
		return this.pdate;
	}
	public void setPdate(Date pdate){
		this.pdate = pdate;
	}
	
}