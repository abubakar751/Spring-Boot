package com.student_api.rest_templet.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
@Log4j2
public class ApiService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.post.url}")
    private  String postUrl;

    public Object getObject(Integer id){
        String url = postUrl + "/" + id;
        log.info("Requesting  byId Api data"+id);
        return   restTemplate.getForObject(url, Object.class);
    }
    public Object getAll(){
        log.info("Requesting All Api data");
        return restTemplate.getForObject(postUrl, Object.class);
    }
}
