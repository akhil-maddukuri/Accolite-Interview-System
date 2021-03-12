package com.accolite.intersys.signup;



import com.accolite.intersys.user.*;

import java.security.NoSuchAlgorithmException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.intersys.user.User;

@RestController
public class Login{


	@Autowired
	UserService userservice;
	
	
	@RequestMapping(method=RequestMethod.POST,value="/login")
	public int adduser(@RequestBody ArrayList<String> user) throws NoSuchAlgorithmException //The request body coming from UI should be a array list
	{
		User res;
		
		

		res = userservice.findById(user.get(0));
		
		if(res.getPassword().equals(PasswordEncoder.encode(user.get(1)))){
			
			return 1;
				
		
		}
		
		return 0;
		
		
		
		
	}
	
	
	
}
