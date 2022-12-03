package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllr {
	@RequestMapping("/")
	public String showPage() {
		return "show-menu";
	}
	
	@RequestMapping("/hello")
	public String showHelloPage() {
		return "show-hello-menu";
	}
	
	@RequestMapping("/gethello")
	public String getHelloPage() {
		return "main-menu";
	}
	@RequestMapping("/welcomehello")
	public String welcomeHelloPage() {
		return "welcome-menu";
	}

}
