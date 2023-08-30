package com.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.springmvc.entities.User;


public interface UserDao {
	public int saveUser(User user);

}
