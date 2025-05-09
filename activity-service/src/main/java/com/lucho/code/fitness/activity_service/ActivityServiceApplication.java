package com.lucho.code.fitness.activity_service;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivityServiceApplication {


	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(), entry.getValue())
		);
		System.out.println("DB_URL = " + System.getProperty("DB_URL_ACTIVITY"));
		SpringApplication.run(ActivityServiceApplication.class, args);
	}

}
