package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_organization")
public class TbOrganization implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "orgname")
	private String orgname;// 
	
	@Column(name = "parentcode")
	private Integer parentcode;// 
	
	@Column(name = "level")
	private String level;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getOrgname(){
		return this.orgname;
	}
	public void setOrgname(String orgname){
		this.orgname = orgname == null ? null : orgname.trim();
	}
	public Integer getParentcode(){
		return this.parentcode;
	}
	public void setParentcode(Integer parentcode){
		this.parentcode = parentcode;
	}
	public String getLevel(){
		return this.level;
	}
	public void setLevel(String level){
		this.level = level == null ? null : level.trim();
	}
	
}