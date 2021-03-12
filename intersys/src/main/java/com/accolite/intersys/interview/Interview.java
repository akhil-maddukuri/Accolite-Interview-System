package com.accolite.intersys.interview;

import java.sql.Date;


public class Interview {
	
	String interview_id;
	String interviewer_name;
	String hr_id;
	String candidate_name;
	String gmeetlink;
	Date date;
	String feedback;
	int round;
	String status;

	
	public Interview() {
		
	}
	public Interview(String interview_id, String interviewer_name, String hr_id, String candidate_name, String gmeetlink,
			Date date,String feedback, int round, String status) { 
		super();
		this.interview_id = interview_id;
		this.interviewer_name = interviewer_name;
		this.hr_id = hr_id;
		this.candidate_name = candidate_name;
		this.gmeetlink = gmeetlink;
		this.date=date;
		this.feedback = feedback;
		this.round = round;
		this.status = status;

	}
	public String getInterview_id() {
		return interview_id;
	}
	public void setInterview_id(String interview_id) {
		this.interview_id = interview_id;
	}
	public String getInterviewer_name() {
		return interviewer_name;
	}
	public void setInterviewer_name(String interviewer_name) {
		this.interviewer_name = interviewer_name;
	}
	public String getHr_id() {
		return hr_id;
	}
	public void setHr_id(String hr_id) {
		this.hr_id = hr_id;
	}
	public String getCandidate_name() {
		return candidate_name;
	}
	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}
	public String getGmeetlink() {
		return gmeetlink;
	}
	public void setGmeetlink(String gmeetlink) {
		this.gmeetlink = gmeetlink;
	}
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
