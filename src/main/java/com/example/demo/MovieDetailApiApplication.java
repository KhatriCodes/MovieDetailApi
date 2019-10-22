package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.example.controller.MovieDetailController;
import com.example.service.MovieDetailService;

@SpringBootApplication
@ComponentScan(basePackageClasses=MovieDetailController.class)
@ComponentScan(basePackageClasses=MovieDetailService.class)
public class MovieDetailApiApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(MovieDetailApiApplication.class, args);
	}

}
