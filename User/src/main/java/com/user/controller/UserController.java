package com.user.controller;

import com.user.dto.UserDto;
import com.user.entity.User;
import com.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/save")
    public UserDto save(@RequestBody UserDto userDto) {
 return  iUserService .save(userDto);
    }
    @GetMapping("get/{id}")
    public  UserDto getDataById(@PathVariable int id){
       return iUserService.fetchDataById(id);
    }
    @GetMapping("/getAll")
    public List<UserDto> getAllData(){
        return iUserService.getAll();
    }
    @PutMapping("update/{id}")
    public  UserDto update(@PathVariable int id ,@RequestBody UserDto user){
      return   iUserService.updateData(id,user);
    }
    @DeleteMapping("delete/{id}")
    public  String updateData(@PathVariable int id , User user){
           iUserService.deleteData(id);
           return  "data deleted";
    }

}
