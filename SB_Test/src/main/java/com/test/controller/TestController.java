package com.test.controller;

import com.test.enitit.TestEntity;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class TestController {
    @Autowired
    private TestService testService;
    @PostMapping("/post")
    public  TestEntity addingdata(@RequestBody TestEntity testEntity){
        TestEntity   add= testService.addData(testEntity);
        return add ;
    }
    @GetMapping("/get/{id}")
    public TestEntity gettin(@PathVariable int id){
        return testService.getData(id);
    }
    @GetMapping("/getAll")
    public List<TestEntity> getAll(){

        return testService.getAllData();
    }
    @PutMapping ("/put/{id}")
    public TestEntity updatedata(@RequestBody TestEntity testEntity ,@PathVariable int id){
      return   testService.updateData(testEntity,id);
    }
    @DeleteMapping("/delete/{id}")
    public String  deletetin(@PathVariable int id){
        testService.deleteData(id);
        return "deletetin";
    }



}
