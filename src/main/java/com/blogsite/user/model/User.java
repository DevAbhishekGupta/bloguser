package com.blogsite.user.model;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "users")
public class User {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	//@Column(unique = true)
	@NotBlank
	@Indexed(unique = true)
	private String username;
	
	@NotBlank
	private String password;

	private Character role;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Character getRole() {
		return role;
	}

	public void setRole(Character role) {
		this.role = role;
	}
	
}
