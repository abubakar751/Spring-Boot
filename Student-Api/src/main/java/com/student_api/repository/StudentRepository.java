package com.student_api.repository;

import com.student_api.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository< StudentEntity,Integer> {

}
