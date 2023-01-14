package com.luv2code.springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/user")
	public String saveUser() {
		System.out.println("Hi Inside save user");
		System.out.println("Code to save user");
	    System.out.println("Done save user");
		return "saved-user";
	}
	
	@RequestMapping("/user/{id}")
	public String getUserById() {
		System.out.println("Code to find user by Id");
		return "list-user";
	}
}



