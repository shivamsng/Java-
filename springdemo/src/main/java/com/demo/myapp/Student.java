package com.demo.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {

	@GetMapping("/student")
	String hello() {
		return "How are you";
	}
}
