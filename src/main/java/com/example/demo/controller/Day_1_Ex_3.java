package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day_1_Ex_3 {
	@Value("${color}")
	private String color;
	@GetMapping("color")
	public String getFav()
	{
		return "My favorite color is "+this.color;
	}
}
