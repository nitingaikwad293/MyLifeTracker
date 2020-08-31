package com.mylifetracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylifetracker.dao.UserDAO;
import com.mylifetracker.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDAO;
	
	
	public List<User> getUserList(){
		
		List<User> userList = new ArrayList<User>();
		
		userDAO.findAll().forEach(userList::add);
		
		return userList;
		
		
	}
	
	
	public User addUser(User user) {
		
		return userDAO.save(user);
		
	}


	public User updateUser(User user) {
		return userDAO.save(user);
	}
	

}
