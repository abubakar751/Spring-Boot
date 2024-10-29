package com.student_api.rest_templet.service;

import com.student_api.rest_templet.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LocalApiService implements ILocalApiService {


    @Autowired
    private RestTemplate restTemplate;

    @Value("${local.api.url}")
    String url;

    @Override
    public StudentDto insert(StudentDto studentDto) {
        String urls=url+"/createEmp";
      return  restTemplate.postForObject(urls, studentDto,StudentDto.class);

    }
    public List<StudentDto> getData() {
        String urls=url+"/fetchAll";
        return restTemplate.getForObject(urls, List.class);
    }
    public StudentDto getById(int id){

            String urls=url+"/fetch/{id}";
        return restTemplate.getForObject(urls, StudentDto.class,id);
    }

    public String deleteData(int id) {
    String urls = url + "/delete/{id}";
    restTemplate.delete(urls, id);
    return "deleted" + id;
    }

    @Override
    public void updateData(int id,StudentDto studentDto) {
            String urls = url + "/update/" + id;
            restTemplate.put(urls, studentDto, String.class);
        }




}