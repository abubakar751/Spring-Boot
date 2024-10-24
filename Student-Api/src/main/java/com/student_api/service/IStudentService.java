package com.student_api.service;

import com.student_api.dto.StudentDTO;
import com.student_api.entity.StudentEntity;

import java.util.List;

public interface IStudentService {
    public StudentDTO insert(StudentDTO studentDTO);
    public StudentDTO getById(int id);
    public List<StudentDTO> getAll();
    public StudentDTO updateData(int id, StudentEntity studentEntity);
public String deleteData(int id );
}
