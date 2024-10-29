package com.student_api.rest_templet.service;

import com.student_api.entity.Student_Entity;
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
    public String insert(Student_Entity studentEntity) {
        String urls=url+"/createEmp";
        String postForObject = restTemplate.postForObject(urls, studentEntity, String.class);
        System.out.println(postForObject);
        return  "data created";
    }

    public List<Student_Entity> getData() {
        String urls=url+"/fetchAll";
        return restTemplate.getForObject(urls, List.class);
    }
    public Student_Entity getById(int id ){
            String urls=url+"/fetch/{id}";
        return restTemplate.getForObject(urls, Student_Entity.class,id);
    }

    public String deleteData(int id) {
        String urls=url+"/delete/{id}";
        restTemplate.delete(urls,id);
        return "deleted"+id;
    }

    @Override
    public void updateData(int id,Student_Entity studentEntity) {
       String urls=url+"/update/"+id;
        restTemplate.put(urls, studentEntity, String.class);


    }


}
