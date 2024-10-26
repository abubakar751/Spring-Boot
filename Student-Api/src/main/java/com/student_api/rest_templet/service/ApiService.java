package com.student_api.rest_templet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ApiService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.post.url}")
  private  String postUrl;

    public Object getObject(Integer id){
        String url = postUrl + "/" + id;
        return   restTemplate.getForObject(url, Object.class);
    }
    public Object getAll(){
        return restTemplate.getForObject(postUrl, Object.class);
    }
}
