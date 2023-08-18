package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2_Ex_1 {
	
	@Value("Kingsley Calex")
	private String myName;
	
	@GetMapping("calex")
	public String display()
	{
		return myName;
	}

}
