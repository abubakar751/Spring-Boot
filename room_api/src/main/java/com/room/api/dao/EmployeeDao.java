package com.room.api.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.room.api.model.Employee_mdl;
import com.room.api.repositoy.IEmployeeReposiory;
@Component
public class EmployeeDao{
	@Autowired
	private IEmployeeReposiory employeeReposiory;
	public String createdEmployee(Employee_mdl employee_mdl) {
		Employee_mdl save = employeeReposiory.save(employee_mdl);
		return "data Save successfully...";
}
}
