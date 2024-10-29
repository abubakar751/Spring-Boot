package com.self.api.service;

import java.util.List;

import java.util.Optional;

import com.self.api.entity.Student_Entity;

public interface IStudent_Service {
	String createStudent(Student_Entity student_Entity);

	Student_Entity fetchByID(int id);

	List<Student_Entity> fetchAll();

	String deleteStudent(int id);

	Student_Entity updateById(int id, Student_Entity student_Entity);

}
