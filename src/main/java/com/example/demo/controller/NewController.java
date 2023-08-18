package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	
	@Value("${var}")// FETCHING THE VALUE FROM THE VARIABLE. HENCE, $ SYMBOL. var is fetched from
	//application properties
	private String name;
	@Value("${newvar}")
	private String name2;
	@GetMapping("print")
	public String print2()
	{
		return "Hi "+name+" !";
	}
	@GetMapping("printing")
	public String printNew()
	{
		return name2;
	}
}
