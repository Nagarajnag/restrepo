package com.nt.controller;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.UserService;

@RestController
public class UserController {
	 
	@Autowired
	 private UserService service;
	
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	@ResponseBody
     public String sayHello(){
    	 return "Welcome to spring rest";
     }
	@RequestMapping(value="/getUserInfo/{userid}",method=RequestMethod.GET)
	@ResponseBody
	public String getUserDetails(@PathVariable("userid") Integer userid){
		String jsonStr=service.getUserDetails(userid);
		return jsonStr;
	}
}
