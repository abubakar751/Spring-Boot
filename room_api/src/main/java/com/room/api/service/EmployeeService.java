package com.room.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.room.api.dao.EmployeeDao;
import com.room.api.model.Employee_mdl;
import com.room.api.repositoy.IEmployeeReposiory;

@Service
public class EmployeeService implements IEmployeeService{
     @Autowired
	EmployeeDao empDao;

	@Override
	public String createdEmployee(Employee_mdl employee_mdl) {
String createdEmployee = empDao.createdEmployee(employee_mdl);
		return "data Save successfully...";
	}
	
	


	
	


}
