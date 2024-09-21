package com.springbootcurd.service;

import java.util.List;


import com.springbootcurd.model.User;

public interface UserService {
	
	public User saveUser(User user);
	public void deleteById(Integer id);
	public User updateUser(User user , Integer id);
	public List<User> findAll();
	public User findByUserId(Integer id);
	
	 
	

}
