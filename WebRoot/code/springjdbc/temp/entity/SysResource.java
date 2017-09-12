package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "sys_resource")
public class SysResource implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "cpu")
	private Integer cpu;// 
	
	@Column(name = "ram")
	private Integer ram;// 
	
	@Column(name = "disk")
	private Integer disk;// 
	
	@Column(name = "usedcpu")
	private Integer usedcpu;// 
	
	@Column(name = "usedram")
	private Integer usedram;// 
	
	@Column(name = "useddisk")
	private Integer useddisk;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getCpu(){
		return this.cpu;
	}
	public void setCpu(Integer cpu){
		this.cpu = cpu;
	}
	public Integer getRam(){
		return this.ram;
	}
	public void setRam(Integer ram){
		this.ram = ram;
	}
	public Integer getDisk(){
		return this.disk;
	}
	public void setDisk(Integer disk){
		this.disk = disk;
	}
	public Integer getUsedcpu(){
		return this.usedcpu;
	}
	public void setUsedcpu(Integer usedcpu){
		this.usedcpu = usedcpu;
	}
	public Integer getUsedram(){
		return this.usedram;
	}
	public void setUsedram(Integer usedram){
		this.usedram = usedram;
	}
	public Integer getUseddisk(){
		return this.useddisk;
	}
	public void setUseddisk(Integer useddisk){
		this.useddisk = useddisk;
	}
	
}