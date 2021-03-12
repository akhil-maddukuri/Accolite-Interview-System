package com.accolite.intersys.candidate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CandidateJobController {

	
	@Autowired
	private CandidateJobService candidatejobservice;
	
	
	@RequestMapping(path="/candidate/jobs") 
	public List<CandidateJob> getAllCandidateJobs()
	{
		return candidatejobservice.findAll();
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST,value="/candidate/applyjob")
	public void adduser(@RequestBody CandidateJob candidatejob)
	{
		candidatejobservice.insert(candidatejob);
	}
	
	@RequestMapping(path="/candidate/jobs/{id}") 
	public List<CandidateJob> getCandidateJob(@PathVariable String id)
	{
		return candidatejobservice.findById(id);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/candidatejob/delete")
	public void deleteuser( @RequestBody CandidateJob candidatejob)
	{
		candidatejobservice.delete(candidatejob);
	}
	
	
}
