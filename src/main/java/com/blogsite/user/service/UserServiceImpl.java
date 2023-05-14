package com.blogsite.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogsite.user.model.User;
import com.blogsite.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User addUser(User user) {
		if (user != null) {
			//User user1 = userRepo.saveAndFlush(user);
			User user1 = userRepo.save(user);
			return user1;

		} else {
			return null;
		}
	}
	
	/*
	@Override
	public boolean validateUserLogin(String username, String password) {
		User user = userRepo.validateUser(username, password);
		
		if(user!=null)
		{
			return true;
		}
		
		else {
			return false;
		}
	}

	@Override
	public User getUserDetails(String username) {
		return userRepo.getUserDetails(username);
	}
	*/
	
	/*
	@Override
	public String isUserExist(String userName) {
		String username = userRepo.isUserExist(userName);
		
		if(username != null) {
			return username;
		}else {
			return null;
		}
	}
	*/
	
}
