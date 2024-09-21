package com.springbootcurd.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcurd.model.User;
import com.springbootcurd.repos.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private  UserRepo userRepo;
	 

	@Override
	public User saveUser(User user) {
		if(Objects.nonNull(user)) {
		     return  userRepo.save(user);
		
		}
		
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		
		 userRepo.deleteById(id);
        		
	}

	@Override
	public User updateUser(User user, Integer id) {
	 
		User user1 = userRepo.findById(id).get();
		if(Objects.nonNull(user.getFirstName())&& !"".equalsIgnoreCase(user1.getFirstName()))
		              user1.setFirstName(user.getFirstName());
		            if(Objects.nonNull(user.getLastName())&& !"".equalsIgnoreCase(user1.getLastName()))
                         user1.setLastName(user.getLastName());
		   if(Objects.nonNull(user.getPhone())&& !"".equalsIgnoreCase(user1.getPhone()))
		        	           user1.setPhone(user.getPhone());	
		           if(Objects.nonNull(user.getRollNumber())&& !"".equalsIgnoreCase(user1.getRollNumber()))
		        	            user1.setRollNumber(user.getRollNumber());
		    	 
		return userRepo.save(user1);
		
	}

	@Override
	public List<User> findAll() {
		
		return userRepo.findAll();
	}

	@Override
	public User findByUserId(Integer id) {
	       
		        return userRepo.findById(id).get();
		        
		}
		 
	

}

