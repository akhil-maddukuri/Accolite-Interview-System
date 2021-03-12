package com.accolite.intersys.user;

import java.sql.Date;

public class User {

	private String id;
	private String name;
	private String email;
	private String password;
	private String type;
	private String gender;
	private Date dob;
	private String feedback;
	private String resume_link;
	
	public User() {
	
	}
	
	
	
	
	public User(String id, String name, String email, String password, String type, Date dob,
			String feedback,String resume_link) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.type = type;
		this.gender = "Male";
		this.dob = dob;
		this.feedback = feedback;
		this.resume_link = resume_link;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
	public String getResume_link() {
		return resume_link;
	}
	public void setResume_link(String resume_link) {
		this.resume_link = resume_link;
	}

	

}
