package com.self.api.service;

import java.util.List;

import com.self.api.dto.StudentDto;
import com.self.api.entity.Student_Entity;

public interface IStudent_Service {
	StudentDto createStudent(StudentDto student_Entity);

	StudentDto fetchByID(int id);

	List<StudentDto> fetchAll();

	String deleteStudent(int id);

	StudentDto updateById(int id, StudentDto studentDto);

}
