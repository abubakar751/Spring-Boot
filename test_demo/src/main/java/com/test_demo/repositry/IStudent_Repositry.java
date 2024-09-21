package com.test_demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test_demo.entity.Student_Entity;

public interface IStudent_Repositry  extends JpaRepository<Student_Entity, Integer>{

}
