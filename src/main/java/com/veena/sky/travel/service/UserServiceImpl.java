package com.veena.sky.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veena.sky.travel.model.User;
import com.veena.sky.travel.repository.UserRepository;


@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> fetchUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public User fetchUserByUserName(String userName) {
		return null;

	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		 System.out.println("userName============>>>>>"+ user.getUserName());
//		 System.out.println("userName============>>>>>"+ users.size());
//		 users.add(user);
		 userRepository.save(user);
		 
	}
	

}
