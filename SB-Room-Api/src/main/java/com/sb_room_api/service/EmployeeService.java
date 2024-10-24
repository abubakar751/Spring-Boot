package com.sb_room_api.service;

import com.sb_room_api.dao.EmplyeeRepo;
import com.sb_room_api.model.EmployeeDTO;
import com.sb_room_api.model.Emplyee;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Log4j2
@Service

public class EmployeeService  implements IEmployeeService {
    @Autowired
    private EmplyeeRepo emplyeeRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private EmployeeDTO employeeDTO;
    @Override
    public EmployeeDTO insert(EmployeeDTO employeeDTO) {
        log.info("employee request :{}", employeeDTO);
        Emplyee employee = modelMapper.map(employeeDTO, Emplyee.class);
                employee = emplyeeRepo.save(employee);
        return modelMapper.map(employee,EmployeeDTO.class);
    }
    @Override
    public List<EmployeeDTO> fetchAll() {

        List<Emplyee> all = emplyeeRepo.findAll();
        List<EmployeeDTO> employeeDTOList = all.stream().map(emplyee -> modelMapper.map(emplyee, EmployeeDTO.class)).collect(Collectors.toList());
        log.info("employee request :{}", employeeDTOList);
        return employeeDTOList;

    }

    @Override
    public Optional<Emplyee> fetchById(int id) {

        EmployeeDTO map = modelMapper.map(id, EmployeeDTO.class);

        Optional<Emplyee> byId = emplyeeRepo.findById(id);
        log.info("Employee db response:{}", byId.toString());
        return byId;

    }

    @Override
    public String deleteDataById(int id) {
        emplyeeRepo.findById(id);
        if (emplyeeRepo.existsById(id)) {
            log.info("employee request :{}", id);
            emplyeeRepo.deleteById(id);
            return "Employee deleted successfully";
        }
        else {
            return "Employee not found";

        }

    }

    @Override
    public EmployeeDTO updateData(int id, EmployeeDTO employeeDTO) {
        Optional<Emplyee> byId = emplyeeRepo.findById(id);
        if (byId.isPresent()) {
            Emplyee employee = modelMapper.map(employeeDTO, Emplyee.class);
            Emplyee emplyee = byId.get();
            emplyee.setName(employeeDTO.getName());
            emplyee.setAddress(employeeDTO.getAddress());
            emplyee.setZipCode(employeeDTO.getZipCode());
            emplyee.setCity(employeeDTO.getCity());
            emplyee.setId(employeeDTO.getId());
            emplyeeRepo.save(emplyee);
            log.info("employee request :{}", employeeDTO);
            return modelMapper.map(employee,EmployeeDTO.class);

        }else {
            return null;
        }
    }
}