package com.newssystem.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(NewsSystemApplication.class, args);
		System.out.println("Hello Guys");
	}
}
