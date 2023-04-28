package com.springAss.model;

public class Contents {
private int id;
private String title;
private String content;
private String createdDate;
public Contents(int id, String title, String content, String createdDate) {
	super();
	this.id = id;
	this.title = title;
	this.content = content;
	this.createdDate = createdDate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
@Override
public String toString() {
	return "Contents [id=" + id + ", title=" + title + ", content=" + content + ", createdDate=" + createdDate + "]";
}
public String getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(String createdDate) {
	this.createdDate = createdDate;
}
}
