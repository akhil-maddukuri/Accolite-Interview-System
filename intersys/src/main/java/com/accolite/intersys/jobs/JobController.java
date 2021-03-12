package com.accolite.intersys.jobs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
	
	@Autowired
	private JobService jobservice;
	
	
	@RequestMapping(path="/jobs") 
	public List<Job> getAllJobs()
	{
		return jobservice.findAll();
	}
	
	@RequestMapping(path="/jobs/{id}") 
	public Job getJob(@PathVariable String id)
	{
		return jobservice.findById(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/hr/addjob")
	public void addjob(@RequestBody Job job)
	{
			jobservice.insert(job);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/hr/jobs/{id}")
	public void updateuser(@RequestBody Job job, @PathVariable String id)
	{
		jobservice.update(job,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/hr/jobs/{id}")
	public void deleteuser( @PathVariable String id)
	{
		jobservice.deleteById(id);
	}
	

}
