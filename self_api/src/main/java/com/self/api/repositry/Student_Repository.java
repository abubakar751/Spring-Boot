package com.self.api.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.self.api.entity.Student_Entity;

public interface Student_Repository extends JpaRepository<Student_Entity, Integer> {

}
