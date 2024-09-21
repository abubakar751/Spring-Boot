package com.test_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test_demo.entity.Student_Entity;
import com.test_demo.service.Student_service;

@RestController
@RequestMapping("/student")
public class Student_Controller {
	@Autowired
	private Student_service student_service;
	@PostMapping("/createdStudent")
	public String createdStudent(@RequestBody Student_Entity student_Entity) {
		String createdStudent = student_service.createdStudent(student_Entity);
		
		
		return "Created SuccessFully" +createdStudent;
	}
	
	
	
	
	

}
