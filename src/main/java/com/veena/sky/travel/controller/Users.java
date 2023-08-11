package com.veena.sky.travel.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.veena.sky.travel.model.User;
import com.veena.sky.travel.service.UserService;


@RestController
@RequestMapping(value="/users")
public class Users {
	@Autowired
	private UserService userDS;
	
	@GetMapping
	public @ResponseBody List<User> getUsers(){
		return  userDS.fetchUsers();
	}
	
	@RequestMapping(value ="/users/{userName}", method=RequestMethod.GET)
	public @ResponseBody User getUserByUserName(@RequestParam String userName) {
		return userDS.fetchUserByUserName(userName);
	}
	
	@PostMapping
	public void createUser(@RequestBody User user) {
		System.out.println(" save user::>>>>"+ user);
		userDS.createUser(user);
	}
}
