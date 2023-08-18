package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day_1_Ex_2 {
	@Value("${person}")
	private String name;
	@GetMapping("/")
	public String display()
	{
		return "Welcome "+this.name;
	}
	
}
