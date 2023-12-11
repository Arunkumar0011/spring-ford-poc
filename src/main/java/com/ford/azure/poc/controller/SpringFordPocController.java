package com.ford.azure.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringFordPocController {
	
	@GetMapping("/welcome")
	public String getMessage() {
		return "Welcome to Your Next Chapter: Spring Boot App Takes Flight with Azure Deployment POC!";
	}

}
