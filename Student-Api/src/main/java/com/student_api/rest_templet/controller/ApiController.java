package com.student_api.rest_templet.controller;

import com.student_api.rest_templet.service.ApiService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
@Log4j2
public class ApiController {

    @Autowired
 private ApiService apiService;
    @GetMapping("/get/{id}")
    public Object getPost(@PathVariable Integer id){
        log.info("RestTempleted data"+id);
        return  apiService.getObject(id);
    }
    @GetMapping("/getAll")
    public Object getAllOb(){
        log.info("GetAll Data of RestTemplet data");
        return apiService.getAll();
    }
}
