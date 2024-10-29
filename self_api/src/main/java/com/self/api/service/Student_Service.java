package com.self.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.self.api.entity.Student_Entity;
import com.self.api.repositry.Student_Repository;

@Service
public class Student_Service implements IStudent_Service {
	@Autowired
	private Student_Repository student_Repository;

	@Override

	public String createStudent(Student_Entity student_Entity) {
		Student_Entity save = student_Repository.save(student_Entity);

		return "Data SuccesFull created";
	}

	@Override
	public Student_Entity fetchByID(int id) {
		Student_Entity byId = student_Repository.findById(id).get();
		return byId;

	}

	@Override
	public List<Student_Entity> fetchAll() {
		List<Student_Entity> all = student_Repository.findAll();

		return all;
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
	public Student_Entity updateById(int id, Student_Entity std) {
		Student_Entity student_Entity = student_Repository.findById(id).get();
		if (student_Entity != null) {

			student_Entity.setName(std.getName());
			student_Entity.setGender(std.getGender());
			student_Entity.setAddress(std.getAddress());
			return student_Repository.save(student_Entity);

		} else {

			throw new RuntimeException("Student not found with id: " + id);
		}
	}

}
