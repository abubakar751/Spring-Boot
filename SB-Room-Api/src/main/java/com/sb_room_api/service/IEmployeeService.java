package com.sb_room_api.service;

import com.sb_room_api.model.EmployeeDTO;
import com.sb_room_api.model.Emplyee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    EmployeeDTO insert(EmployeeDTO employee);
    List<EmployeeDTO> fetchAll();
    Optional<Emplyee> fetchById(int id);
    String deleteDataById(int id);
    EmployeeDTO updateData(int id,EmployeeDTO employeeDTO);
}
