package com.room.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.room.api.model.Employee_mdl;
import com.room.api.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmpCntrlr {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create_emp")
	public String createEmployee(@RequestBody Employee_mdl employee_mdl)
	{
		String createdEmployee = employeeService.createdEmployee(employee_mdl);
		return  "Create Successfully..."+createdEmployee;
	}

}
