package com.springSearch.entities;

import java.util.Date;
import java.util.List;

public class Student {
	
	private String username;
	private String userid;
	private Date date;
	private List<String> courses;
	private String gender;
	private String type;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Student [username=" + username + ", userid=" + userid + ", date=" + date + ", courses=" + courses
				+ ", gender=" + gender + ", type=" + type + "]";
	}
	
	
}
