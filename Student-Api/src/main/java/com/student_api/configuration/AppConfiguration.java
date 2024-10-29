package com.student_api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        // Connection timeout in milliseconds
        return new RestTemplate();
    }

}
