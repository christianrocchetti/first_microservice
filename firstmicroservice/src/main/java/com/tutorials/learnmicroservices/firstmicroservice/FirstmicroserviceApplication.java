package com.tutorials.learnmicroservices.firstmicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstmicroserviceApplication implements CommandLineRunner {

	// log dello stato del sistema
	private static final Logger log = LoggerFactory.getLogger(FirstmicroserviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstmicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Hello");
	}
}
