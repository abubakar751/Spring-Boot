package com.student_api.controller;

import com.student_api.dto.StudentDTO;
import com.student_api.entity.StudentEntity;
import com.student_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save")
     StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
       return studentService.insert(studentDTO);
    }
@GetMapping("/getBYId/{id}")
     StudentDTO getStudentById(@PathVariable int id) {
        return studentService.getById(id) ;
    }
    @GetMapping("/getAll")
  List<StudentDTO> getAllStudent(){
        return studentService.getAll();
    }

    @PutMapping("/update/{id}")
    StudentDTO updateStudent(@PathVariable int id , @RequestBody StudentEntity studentEntity){
        return  studentService.updateData(id,studentEntity);
    }
    @DeleteMapping("/delete/{id}")
    String deleteData(@PathVariable int id ){
       return studentService.deleteData(id);
    }

}
