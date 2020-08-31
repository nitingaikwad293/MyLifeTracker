package com.mylifetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mylifetracker.model.User;
import com.mylifetracker.service.UserService;

@RestController
@RequestMapping(value = "/mylifetracker")
public class UserController {
	
	@Autowired
	UserService userService ;
	
	
	@RequestMapping(path = "/users")
	public List<User> getUsers(){
	return userService.getUserList();
	}
	
	
	@PostMapping(value = "/users")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PutMapping(value = "/users")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	

}
