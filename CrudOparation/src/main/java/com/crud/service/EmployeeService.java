package com.crud.service;

import java.util.List;


import com.crud.entity.Employee;

public interface EmployeeService {
	Employee createData(Employee employee);

	Employee fetchDataById( Integer id);

	Employee update(Employee employee, Integer id);

	List<Employee> fetchAllData();

	String deleteData(Integer id );

}
