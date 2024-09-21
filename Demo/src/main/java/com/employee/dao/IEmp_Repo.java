package com.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.entity.Emp_Entity;

public interface IEmp_Repo  extends JpaRepository<Emp_Entity, Integer>{

}
