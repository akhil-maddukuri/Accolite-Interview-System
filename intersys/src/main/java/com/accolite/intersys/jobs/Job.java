package com.accolite.intersys.jobs;

public class Job {

	String id;
	String title;
	String description;
	String location;
	String eligibility;
	
	public Job()
	{
		
	}
	
	public Job(String id, String title, String description, String location, String eligibility) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.location = location;
		this.eligibility = eligibility;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	
	
	
}
