package com.demo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MenuRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(MenuRest2Application.class, args);
	}

}
