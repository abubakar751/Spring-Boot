package com.self.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.api.entity.Student_Entity;
import com.self.api.service.Student_Service;

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
	public Optional<Student_Entity> fetchById(@PathVariable int id) {
		Optional<Student_Entity> fetchByID = student_Service.fetchByID(id);
		return fetchByID;
	}

	@GetMapping("/fetchAll")
	public List<Student_Entity> fetchAll(@RequestBody Student_Entity student_Entity) {
		List<Student_Entity> fetchAll = student_Service.fetchAll(student_Entity);
		return fetchAll;
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
