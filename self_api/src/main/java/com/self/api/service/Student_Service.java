package com.self.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.self.api.dto.StudentDto;
import com.self.api.entity.Student_Entity;
import com.self.api.repositry.Student_Repository;

@Service
public class Student_Service implements IStudent_Service {
	@Autowired
	private Student_Repository student_Repository;
	@Autowired
	private ObjectMapper objectMapper;
	@Override
	public StudentDto createStudent(StudentDto studentDto) {
		Student_Entity student_Entity = objectMapper.convertValue(studentDto, Student_Entity.class);

		student_Repository.save(student_Entity);
	return	objectMapper.convertValue(student_Entity, StudentDto.class);
	}

	@Override
	public StudentDto fetchByID(int id) {
		
  Student_Entity student_Entity = student_Repository.findById(id).get();
  return objectMapper.convertValue(student_Entity, StudentDto.class);
	}

	@Override
	public List<StudentDto> fetchAll() {
		ArrayList<StudentDto> arrayList = new ArrayList<>();
		List<Student_Entity> all = student_Repository.findAll();
		for (Student_Entity student_Entity : all) {
			if (student_Entity!=null) {
				StudentDto convertValue = objectMapper.convertValue(student_Entity, StudentDto.class);
				arrayList.add(convertValue);
			}
		}

		return arrayList;
	}

	@Override
	public String deleteStudent(int id) {
		try {
			// Check if student exists before deleting
			if (student_Repository.existsById(id)) {
				student_Repository.deleteById(id);
				return "Data deleted successfully";
			} else {
				throw new RuntimeException("Student not found with id:" + id);
			}
		} catch (EmptyResultDataAccessException e) {
			// Handle the case where no record is found
			throw new RuntimeException("Error occurred while deleting student with id: " + id, e);
		}

	}

	@Override
	public StudentDto updateById(int id, StudentDto studentDto) {
		Student_Entity student_Entity = student_Repository.findById(id).get();
		if (student_Entity != null) {

			student_Entity.setName(studentDto.getName());
			student_Entity.setGender(studentDto.getGender());
			student_Entity.setAddress(studentDto.getAddress());
			 Student_Entity save = student_Repository.save(student_Entity);
			 return objectMapper.convertValue(save,StudentDto.class);

		} else {

			throw new RuntimeException("Student not found with id: " + id);
		}
	}

	

	

}
