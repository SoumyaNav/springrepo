package com.staragile.assignment.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
 
  @RestControllerAdvice
  
public class springbootdemocontroller {
	
	@RequestMapping("/hello") 
	public String springbootdemocontroller() {
		
		return "Hello Springboot : Initializer";
		
	}

}
