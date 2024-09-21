package com.test_demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.test_demo.entity.Student_Entity;
import com.test_demo.repositry.IStudent_Repositry;

public class Student_service implements IStudent_Service {
@Autowired
	private IStudent_Repositry student_Repositry;
	public String createdStudent(Student_Entity student_Entity) {
       student_Repositry.save(student_Entity);
		return null;
	}
	

}
