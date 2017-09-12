package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "book_two")
public class BookTwo implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "two_name")
	private String twoName;// 
	
	@Column(name = "pid")
	private Integer pid;// 
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getTwoName(){
		return this.twoName;
	}
	public void setTwoName(String twoName){
		this.twoName = twoName == null ? null : twoName.trim();
	}
	public Integer getPid(){
		return this.pid;
	}
	public void setPid(Integer pid){
		this.pid = pid;
	}
	
}