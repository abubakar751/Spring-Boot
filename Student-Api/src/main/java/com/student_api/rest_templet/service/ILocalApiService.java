package com.student_api.rest_templet.service;

import com.student_api.rest_templet.dto.StudentDto;

import java.util.List;

public interface ILocalApiService {
    StudentDto insert(StudentDto studentDto);
     List<StudentDto> getData();
     StudentDto  getById(int id );
     String deleteData(int id);
    void updateData(int id,StudentDto studentDto);
}
