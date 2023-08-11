package com.spring.data.jpa.service;

import java.util.List;

import com.spring.data.jpa.model.User;


public interface UserService {

	public List<User> fetchUsers();
	
	public User fetchUserByUserName(String userName);
	
	public void createUser(User user);
	
}
