package com.student_api.rest_templet.controller;

import com.student_api.entity.Student_Entity;
import com.student_api.rest_templet.service.ILocalApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class LocalApiController {

    @Autowired
    private ILocalApiService iLocalApiService ;
    @PostMapping("/creating")
    public ResponseEntity<String> postData(@RequestBody Student_Entity studentEntity){
     iLocalApiService.insert(studentEntity);
     return  ResponseEntity.ok("Data created");
    }
    
    @GetMapping("/fetchAllData")
    public List<Student_Entity> getAllData() {
        return iLocalApiService.getData();
    }
    @GetMapping("/fetch/{id}")
    public Student_Entity getDataByID(@PathVariable int id){
       return iLocalApiService.getById(id);
    }
@DeleteMapping("/delete/{id}")
  public String deleteData(@PathVariable int id){
        iLocalApiService.deleteData(id);
        return  "deletedData ";
  }
  @PutMapping("/updateData/{id}")
  public String deleteData(@RequestBody Student_Entity studentEntity,@PathVariable int id){
        iLocalApiService.updateData(id,studentEntity);
        return  "Updated Data  :"+id;
  }


}
