package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/user")
	public String userPage() {
		return "user-page";
	}
	
	@RequestMapping("/showUser")
	public String showUserPage() {
		return "show-user-page";
	}
	
	@RequestMapping("/getUser")
	public String getUserPage() {
		return "get-page";
	}
	@RequestMapping("/createUser")
	public String createUserPage() {
		return "create-page";
	}

	@RequestMapping("/updateUser")
	public String updateUserPage() {
		return "update-page";

	}
}

