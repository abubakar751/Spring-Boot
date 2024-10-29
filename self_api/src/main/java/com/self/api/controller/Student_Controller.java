package com.self.api.controller;

import com.self.api.entity.Student_Entity;
import com.self.api.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Student_Controller {
	@Autowired
	private Student_Service student_Service;
	
	@PostMapping("/createEmp")
	public String createStudent(@RequestBody Student_Entity entity) {

		student_Service.createStudent(entity);
		return " Data Created";
	}

	@GetMapping("/fetch/{id}")
	public Student_Entity fetchById(@PathVariable int id) {
		return student_Service.fetchByID(id);
	} 

	@GetMapping("/fetchAll")
	public List<Student_Entity> fetchAll() {
		return student_Service.fetchAll();
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		student_Service.deleteStudent(id);
		return " Data  Deleted";

	}

	@PutMapping("/update/{id}")
	public Student_Entity update(@RequestBody Student_Entity student_Entity, @PathVariable int id) {
		return student_Service.updateById(id, student_Entity);

	}

}
