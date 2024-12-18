package com.employeeinfo.service;

import com.employeeinfo.entity.Emp;
import com.employeeinfo.repo.EmpRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EmpService {
    @Autowired
private EmpRepository empRepository;
    @Autowired
   private  ObjectMapper objectMapper;
    public String insertData(String  emp, MultipartFile image,MultipartFile proofId)  {
        String employeeId = null;
        try {
          Emp emp1 = objectMapper.readValue(emp, Emp.class);
          emp1.setImage(image.getBytes());
          emp1.setIdProof(proofId.getBytes());
        employeeId = empRepository.save(emp1).getEmployeeId();
         }catch (Exception e){
         e.printStackTrace();
      }
        return employeeId !=null  ? "Account created":"Account not created";
    }
}
