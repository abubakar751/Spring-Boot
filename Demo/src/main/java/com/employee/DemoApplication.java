package com.employee;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.employee.dao.IEmp_Repo;
import com.employee.entity.Emp_Entity;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		IEmp_Repo repo= run.getBean(IEmp_Repo.class);
	    Emp_Entity emp_Entity = new	Emp_Entity ();
		emp_Entity.setName("Abu ");
		emp_Entity.setCity("Sakinaka");
		 Emp_Entity emp_Entity2 = new	Emp_Entity ();
			emp_Entity2.setName("Bakar");
			emp_Entity2.setCity("Sakinaka");
			List<Emp_Entity> of = List.of(emp_Entity,emp_Entity2);
			Iterable<Emp_Entity> saveAll = repo.saveAll(of);
			System.out.println(saveAll);
			
		
	}

}
