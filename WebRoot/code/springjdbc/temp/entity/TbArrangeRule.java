package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "tb_arrange_rule")
public class TbArrangeRule implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "weeks")
	private String weeks;// 周
	
	@Column(name = "starthours")
	private String starthours;// 
	
	@Column(name = "startmins")
	private String startmins;// 
	
	@Column(name = "endhours")
	private String endhours;// 
	
	@Column(name = "endmins")
	private String endmins;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getWeeks(){
		return this.weeks;
	}
	public void setWeeks(String weeks){
		this.weeks = weeks == null ? null : weeks.trim();
	}
	public String getStarthours(){
		return this.starthours;
	}
	public void setStarthours(String starthours){
		this.starthours = starthours == null ? null : starthours.trim();
	}
	public String getStartmins(){
		return this.startmins;
	}
	public void setStartmins(String startmins){
		this.startmins = startmins == null ? null : startmins.trim();
	}
	public String getEndhours(){
		return this.endhours;
	}
	public void setEndhours(String endhours){
		this.endhours = endhours == null ? null : endhours.trim();
	}
	public String getEndmins(){
		return this.endmins;
	}
	public void setEndmins(String endmins){
		this.endmins = endmins == null ? null : endmins.trim();
	}
	
}