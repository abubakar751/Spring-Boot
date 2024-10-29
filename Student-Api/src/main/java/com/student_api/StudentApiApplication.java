package com.student_api;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class StudentApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentApiApplication.class, args);
		log.info("App is up");
	}

}
