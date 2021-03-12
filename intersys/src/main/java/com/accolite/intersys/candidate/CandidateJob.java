package com.accolite.intersys.candidate;


public class CandidateJob{

	String jobid;
	String candidateid;
	String title;
	
	public CandidateJob() {
		
	}
	
	public CandidateJob(String jobid,String candidateid, String title) {
		super();
		this.candidateid = candidateid;
		this.jobid = jobid;
		this.title = title;
	}
	public String getCandidateid() {
		return candidateid;
	}
	public void setCandidateid(String candidateid) {
		this.candidateid = candidateid;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
}
