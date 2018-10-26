package com.riddhi.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Messages {
	@Id @GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String author;
	/*@OneToMany
	private Comment comment;*/
	
	public Messages() {
	}
	
	public Messages(String name,String author) {
		this.id=id;
		this.name=name;
		this.author=author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
