package com.springbootcurd.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootcurd.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

		  
	

}
