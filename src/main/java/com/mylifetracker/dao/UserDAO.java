package com.mylifetracker.dao;

import org.springframework.data.repository.CrudRepository;

import com.mylifetracker.model.User;

public interface UserDAO extends CrudRepository<User, Long> {

}
