package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.domain.User;
import com.nt.util.JsonUtil;
@Service
public class UserServiceImpl implements UserService{
    public String getUserDetails(Integer userid) {
    	String jsonUser="{}";
    	if(userid!=null&&userid.equals(101)){
    		User user=new User();
    		user.setUserId(1212);
    		user.setUserName("Naga");
    		user.setEmail("Naga@mail.com");
    		user.setMobile("5985");
    		jsonUser=JsonUtil.convertJavaToJson(user);
    	}
    	return jsonUser;
    }
}
