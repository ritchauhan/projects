package com.dev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("Inside Hello methods");
		return "Hello Ritesh! how are you?";
	}
}
