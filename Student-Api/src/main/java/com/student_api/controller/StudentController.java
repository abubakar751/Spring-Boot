package com.student_api.controller;

import com.student_api.dto.StudentDTO;
import com.student_api.entity.StudentEntity;
import com.student_api.service.IStudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
@Log4j2
public class StudentController {
    @Autowired
    private IStudentService iStudentService;
    @PostMapping("/save")
     StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
       log.info("Post Api calling");
        return iStudentService.insert(studentDTO);
    }
@GetMapping("/getBYId/{id}")

     StudentDTO getStudentById(@PathVariable int id) {
    log.info("getBYid Api calling");
        return iStudentService.getById(id) ;
    }
    @GetMapping("/getAll")
  List<StudentDTO> getAllStudent(){
        log.info("getAll Api calling");
        return iStudentService.getAll();
    }

    @PutMapping("/update/{id}")
    StudentDTO updateStudent(@PathVariable int id , @RequestBody StudentEntity studentEntity){
        log.info("Put Api calling");
        return  iStudentService.updateData(id,studentEntity);
    }
    @DeleteMapping("/delete/{id}")
    String deleteData(@PathVariable int id ){
        log.info("delete Api calling");
       return iStudentService.deleteData(id);
    }

}
