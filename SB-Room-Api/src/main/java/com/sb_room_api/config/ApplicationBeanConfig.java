package com.sb_room_api.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApplicationBeanConfig {
    @Bean
public ModelMapper modelMapper() {
  return new ModelMapper();
}
@Bean
public RestTemplate restTemplate() {
        return new RestTemplate();
}
}
