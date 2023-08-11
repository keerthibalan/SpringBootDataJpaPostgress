package com.veena.sky.travel.service;

import java.util.List;

import com.veena.sky.travel.model.User;


public interface UserService {

	public List<User> fetchUsers();
	
	public User fetchUserByUserName(String userName);
	
	public void createUser(User user);
	
}
