package com.employeeinfo.controller;

import com.employeeinfo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService  empService;
    @PostMapping("/postData")
    public String insertData(@RequestParam ("image") MultipartFile image,
    @RequestParam("idProof") MultipartFile idProof,
    @RequestParam ("") String entity){
    return   empService.insertData(entity,image,idProof);

    }
}
