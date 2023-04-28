package com.example.demoSpringBoot.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Tutorials")
public class Tutorial {
	@Id
	int Id;
	String Title;
	String Description;
	@Column(name = "Published Date")
	String Published;
	public Tutorial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tutorial(int id, String title, String description, String published) {
		super();
		Id = id;
		Title = title;
		Description = description;
		Published = published;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPublished() {
		return Published;
	}
	public void setPublished(String published) {
		Published = published;
	}

}
