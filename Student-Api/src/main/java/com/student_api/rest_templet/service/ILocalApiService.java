package com.student_api.rest_templet.service;

import com.student_api.entity.Student_Entity;

import java.util.List;

public interface ILocalApiService {
    String insert(Student_Entity studentEntity);
     List<Student_Entity> getData();
     Student_Entity getById(int id );
     String deleteData(int id);
    void updateData(int id,Student_Entity studentEntity);
}
