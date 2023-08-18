package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day_1_Ex_1 {
	
	@GetMapping("welcome")
	public String message()
	{
		return "Welcome Spring Boot!";
	}
}
