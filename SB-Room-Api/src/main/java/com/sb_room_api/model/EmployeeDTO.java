package com.sb_room_api.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class EmployeeDTO  {
    private int id;
    private String name;
    private String address;
    private int zipCode;
    private String city;


}

