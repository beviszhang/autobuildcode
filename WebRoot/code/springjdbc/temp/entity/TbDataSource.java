package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_data_source")
public class TbDataSource implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "name")
	private String name;// 
	
	@Column(name = "sourcedesc")
	private String sourcedesc;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name == null ? null : name.trim();
	}
	public String getSourcedesc(){
		return this.sourcedesc;
	}
	public void setSourcedesc(String sourcedesc){
		this.sourcedesc = sourcedesc == null ? null : sourcedesc.trim();
	}
	
}