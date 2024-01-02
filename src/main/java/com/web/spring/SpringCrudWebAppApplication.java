package com.web.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudWebAppApplication.class, args);
		System.out.println("App is running");
	}

}
