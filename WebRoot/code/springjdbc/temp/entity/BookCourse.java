package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "book_course")
public class BookCourse implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "pic")
	private String pic;// 图片路径
	
	@Column(name = "name")
	private String name;// 教材名称
	
	@Column(name = "content")
	private String content;// 教材简介
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getPic(){
		return this.pic;
	}
	public void setPic(String pic){
		this.pic = pic == null ? null : pic.trim();
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name == null ? null : name.trim();
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content = content == null ? null : content.trim();
	}
	
}