package org.zkpk.smartlab.entity;
  
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;

@Entity
@Table(name = "book_chapter")
public class BookChapter implements java.io.Serializable {  
	private static final long serialVersionUID = 3L;

	@id
	@Column(name = "id")
	private Integer id;// 
	
	@Column(name = "chapter_name")
	private String chapterName;// 章节名称
	
	@Column(name = "pid")
	private Integer pid;// 教材课程ID
	

	 

	/*#####################get  and  set#####################*/
	
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getChapterName(){
		return this.chapterName;
	}
	public void setChapterName(String chapterName){
		this.chapterName = chapterName == null ? null : chapterName.trim();
	}
	public Integer getPid(){
		return this.pid;
	}
	public void setPid(Integer pid){
		this.pid = pid;
	}
	
}