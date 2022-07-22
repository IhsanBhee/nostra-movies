package com.movies.nostra.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashBoardController {

	@Value("${spring.application.name}")
	private String appName;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to " + appName;
	}
	
}
