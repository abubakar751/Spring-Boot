package com.student_api.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.student_api.dto.StudentDTO;
import com.student_api.entity.StudentEntity;
import com.student_api.exception_handler.StudentNotFoundException;
import com.student_api.repository.StudentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class StudentService  implements IStudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
   private ObjectMapper objectMapper;

    @Override
    public StudentDTO insert(StudentDTO studentDTO) {
        StudentEntity studentEntity=   objectMapper.convertValue(studentDTO, StudentEntity.class);

        studentRepository.save(studentEntity);
        log.info("inserting data");
        return   objectMapper.convertValue(studentEntity,StudentDTO.class);
          }

    @Override
    public StudentDTO getById(int id) {

       StudentEntity studentEntity=  studentRepository .findById(id).get();
        log.info("getting data by Id"+studentEntity);
      return  objectMapper.convertValue(studentEntity,StudentDTO.class);


    }
    public List<StudentDTO> getAll(){
       List <StudentDTO>list= new ArrayList<>();
        List <StudentEntity> studentEntities=   studentRepository.findAll(); //return List of   entities
        for (StudentEntity studentEntity :studentEntities )
            if (studentEntity!=null) {
                StudentDTO studentDTO = objectMapper.convertValue(studentEntity, StudentDTO.class);
               list.add(studentDTO);
            }
        log.info("gettingAll  data"+list);
        return list;
    }

    @Override
    public StudentDTO updateData(int id, StudentEntity studentEntity) {

       Optional< StudentEntity>studentEntity1 = studentRepository.findById(id);
        if (studentEntity1.isPresent()) {
            StudentEntity studentEntity2= studentEntity1.get();
            studentEntity2.setName(studentEntity.getName());
            studentEntity2.setRollNumber(studentEntity.getRollNumber());
            studentEntity2.setCollegeName(studentEntity.getCollegeName());

            StudentEntity entity = studentRepository.save(studentEntity2);
            StudentDTO dto = objectMapper.convertValue(entity, StudentDTO.class);
            log.info("updating data"+dto);
            return dto;
        }else
            throw new StudentNotFoundException("Student not found with ID: " + id);


    }


    @Override
    public String deleteData(int id) {
        Optional<StudentEntity> entity= studentRepository.findById(id);
        if (entity.isPresent()) {


            studentRepository.deleteById(id);
            log.info("deleted data"+id);
            return "deleted " + id;

        }else
            throw new StudentNotFoundException("Student not found with ID: " + id);

    }

}
