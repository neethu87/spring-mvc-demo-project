package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllr {
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/hello")
	public String showHelloPage() {
		return "main-menu";
	}
	@RequestMapping("/home")
	public String goHome() {
		return "home";
	}
	
	@RequestMapping("/logout")
	public String goLogout() {
		return "logout";
	}


}
