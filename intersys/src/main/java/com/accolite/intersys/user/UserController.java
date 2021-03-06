package com.accolite.intersys.user;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	
	
	@RequestMapping(path="/admin/users") 
	public List<User> getAllUsers()
	{
		return userservice.findAll();
	}
	
	@RequestMapping(path="/admin/interviewers") 
	public List<User> getInterviewers()
	{
		return userservice.findInterviewers();
	}
	
	@RequestMapping(path="/admin/candidates") 
	public List<User> getcandidates()
	{
		return userservice.findCandidates();
	}
	
	@RequestMapping(path="/admin/users/{id}") 
	public User getUser(@PathVariable String id)
	{
		return userservice.findById(id);
	}
	@RequestMapping(method=RequestMethod.POST,path="/admin/users/{id}") 
	public User getUserByName(@PathVariable String id)
	{
		return userservice.findByName(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/admin/adduser")
	public void adduser(@RequestBody User user) throws NoSuchAlgorithmException
	{
		//user.setPassword(PasswordEncoder.encode(user.getPassword()));
		userservice.insert(user);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/admin/users/{id}")
	public void updateuser(@RequestBody User user, @PathVariable String id)
	{
		userservice.update(user,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/admin/users/{id}")
	public void deleteuser( @PathVariable String id)
	{
		userservice.deleteById(id);
	}
	

}