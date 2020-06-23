package com.cn.redis.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.redis.po.User;
import com.cn.redis.po.UserExample;
import com.cn.redis.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

	private static final Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired 
	private UserService userService;
	
	@GetMapping("/getusers")
	public List<User> getUsers(){
		try {
			List<User> list = userService.selectAll();
			return list;
		} catch (Exception e) {
			// TODO: handle exceptione
			e.printStackTrace();
		}
		return null;
	}
}
