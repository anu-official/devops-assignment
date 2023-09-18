package com.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {

	public static void main(String[] args) {

		SpringApplication.run(DevopsApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloWorld () {
		return "Hello Devops Assignment";
	}

}
