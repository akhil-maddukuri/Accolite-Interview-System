package com.accolite.intersys.interview;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class InterviewController {
	
	
	@Autowired
	private InterviewService interviewservice;
	
	
	@RequestMapping(path="/interviews")
	public List<Interview> getAllInterviews()
	{
		return interviewservice.findAll();
	}
	
	@RequestMapping(path="/interviews/{id}") 
	public Interview getInterview(@PathVariable String id)
	{
		return interviewservice.findById(id);
	}
	
	@RequestMapping(path="/interviews/past/{id}") 
	public List<Interview> getInterviewByTimeStamp(@PathVariable String id)
	{
		
		return interviewservice.findByTimeStamp(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/addinterview")
	public void addInterview(@RequestBody Interview interview)
	{
		interviewservice.insert(interview);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/interviews/{id}")
	public void updateInterview(@RequestBody Interview interview, @PathVariable String id)
	{
		interviewservice.update(interview,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/interviews/{id}")
	public void deleteInterview( @PathVariable String id)
	{
		interviewservice.deleteById(id);
	}

}
