package com.student_api.rest_templet.controller;

import com.student_api.rest_templet.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ApiController {

    @Autowired
 private ApiService apiService;
    @GetMapping("/get/{id}")
    public Object getPost(@PathVariable Integer id){
        return  apiService.getObject(id);
    }
    @GetMapping("/getAll")
    public Object getAllOb(){
        return apiService.getAll();
    }
}
