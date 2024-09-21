package com.firstpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.firstpro.test.Test;

@SpringBootApplication
public class FirstproApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstproApplication.class, args);
		Test t = (Test) context.getBean(Test.class);
		System.out.println(t.tst());
	}

}
