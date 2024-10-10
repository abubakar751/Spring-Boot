package com.sb.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbJdbcApplication.class, args);

		System.out.println("app created successfully");
	}
}
