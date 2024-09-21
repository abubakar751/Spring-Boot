package com.springbootcurd.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcurd.configuration.Responsehandler;
import com.springbootcurd.model.User;
import com.springbootcurd.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("crud/")
@RequiredArgsConstructor
public class Controller {
	private  UserService userService;
	
	
	
	@PostMapping("/save")
	  public ResponseEntity<User> saveUser(@RequestBody  User user) {
		return ResponseEntity.ok(userService.saveUser(user));
		 
	}
	
	@GetMapping("/get")
	   public ResponseEntity<List<User>> findAll(){
		return ResponseEntity.ok(userService.findAll());
		
	}
        
	  @PostMapping("/update/{id}")
	    public ResponseEntity<User> updateUser(@RequestBody User user , @PathVariable Integer id) {
			return ResponseEntity.ok(userService.updateUser(user, id));
		         
		          
	  }
	  
	   @DeleteMapping("delete/{id}")
	     public ResponseEntity<Responsehandler> deleteByID(@PathVariable Integer id){
		   userService.deleteById(id);
		   return ResponseEntity.ok(new Responsehandler("user deleted successfully" , true));
		   
	   }
	  
	    
	     
}
