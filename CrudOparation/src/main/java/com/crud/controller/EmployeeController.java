package com.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employee;
import com.crud.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

@RequestMapping("/contrlr/data")

@RestController
public class EmployeeController {
	private final EmployeeService employeeService;

	@PostMapping("/create")
	public Employee createEmp(@RequestBody Employee employee) {

		return this.employeeService.createData(employee);
	}

	@PutMapping("/update/{id}")
	public Employee updateData(@RequestBody Employee employee, @PathVariable() Integer id) {

		return this.employeeService.update(employee, id);

	}

	@GetMapping("/find/{id}")
	public Employee findById(@PathVariable Integer id) {
		return this.employeeService.fetchDataById(id);

	}
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable Integer id ) {
		employeeService.deleteData( id);
		return " Delete Succesfull";
		
	}
	@GetMapping("/find")
	public List<Employee> fetchAll(){
		return employeeService.fetchAllData();
		
	}
	

}
