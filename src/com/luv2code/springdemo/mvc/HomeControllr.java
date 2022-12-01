package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllr {
	@RequestMapping("/")
	public String showPage() {
		System.out.println("Hello");
		System.out.println("Checking for conflict");
		return "main-menu";
	}
	
	@RequestMapping("/hello")
	public String showHelloPage() {
		return "main-menu";
	}
	@RequestMapping("/gethello")
	public String getHelloPage() {
		return "hello";
	}
}
