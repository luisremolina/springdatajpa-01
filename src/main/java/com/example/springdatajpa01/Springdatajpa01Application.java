package com.example.springdatajpa01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springdatajpa01Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Springdatajpa01Application.class, args);
		AutoRepository autoRepository = context.getBean(AutoRepository.class);

		System.out.println("Find");
		Auto toyota = new Auto(null, "Toyota", "Prius", 2022);
		autoRepository.save(toyota);
		System.out.println(autoRepository.count());
	}

}
