package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Employee;
import com.crud.repo.EmployeeRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeServiceClass implements EmployeeService {
	@Autowired
	private final EmployeeRepo employeeRepo;

	@Override
	public Employee createData(Employee employee) {
		return employeeRepo.save(employee)

		;
	}

	@Override
	public Employee fetchDataById(Integer id) {
		Employee employee = employeeRepo.findById(id).get();
		return employee;
	}

	@Override
	public Employee update(Employee employee, Integer id) {
		Employee employee3 = new Employee();
		Employee employee2 = employeeRepo.findById(id).get();
		employee3.setId(employee.getId());
		employee3.setName(employee.getName());
		employee3.setAddress(employee.getAddress());
		return employeeRepo.save(employee3);

	}

	@Override
	public List<Employee> fetchAllData() {
		
		return employeeRepo.findAll();
	}

	@Override
	public String deleteData(Integer id ) {
		employeeRepo.deleteById(id);
		return "deleted Succes fully.. ";
	}
 
}
