package com.accolite.intersys.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.intersys.user.*;

@RestController
public class Candidate {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(method=RequestMethod.POST,value="/candidate/signup")
	public String addcandidate(@RequestBody User user)
	{
		
		userservice.insert(user);
		return user.getId();
	}
	
	
	
	
	
	
}
