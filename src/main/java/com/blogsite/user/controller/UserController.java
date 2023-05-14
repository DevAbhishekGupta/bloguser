package com.blogsite.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogsite.user.model.User;
import com.blogsite.user.service.UserServiceImpl;

@RestController
@RequestMapping("api/v1.0/blogsite")
public class UserController {

	//private Map<String, String> mObj = new HashMap<String, String>();

	@Autowired
	private UserServiceImpl userServiceImpl;

	@PostMapping("/user/register")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		if (userServiceImpl.addUser(user) != null) {
			return new ResponseEntity<User>(user, HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("User not added", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/*
	 * @GetMapping("/isUserExist/{userName}") public ResponseEntity<?>
	 * isUserExist(@PathVariable("userName") String userName) {
	 * 
	 * if (userName != null) { String username =
	 * userServiceImpl.isUserExist(userName); boolean isUserExist; if (username !=
	 * null) { isUserExist = true; } else { isUserExist = false; } return new
	 * ResponseEntity<Boolean>(isUserExist, HttpStatus.OK); } else { return new
	 * ResponseEntity<String>("Username can't be null", HttpStatus.NO_CONTENT); } }
	 */
	
}
