package com.sb_room_api.api;

import com.sb_room_api.model.EmployeeDTO;
import com.sb_room_api.model.Emplyee;
import com.sb_room_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeDTO employeeDTO;
   @Autowired
    private EmployeeService employeeService;
   @PostMapping("/insert")
   EmployeeDTO post(@RequestBody EmployeeDTO employeeDTO){

       return employeeService.insert(employeeDTO);
   }
    @GetMapping("/getAll")
    List<EmployeeDTO> getAllEmployee(){
        return employeeService.fetchAll();
    }
    @GetMapping("/getById/{id}")
    Optional<Emplyee> getEmployeeById(@PathVariable int id){
       return employeeService.fetchById(id);
    }
    @DeleteMapping("/deleteById/{id}")
     String  deleteEmployeeById(@PathVariable int id) {
       return employeeService.deleteDataById(id);
    }
    @PutMapping("/update/{id}")
    public Object updateEmplyee(@PathVariable int id, @RequestBody EmployeeDTO emplyee) {
        return employeeService.updateData(id, emplyee);
    }


}
