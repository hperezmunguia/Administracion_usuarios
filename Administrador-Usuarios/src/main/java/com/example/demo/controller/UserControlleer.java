package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserControlleer {
	
	@GetMapping("/")
	public String index() {
		return"index";
	}
	@GetMapping("/user-form")
	public String getUserForm() {
		return "user-form/user-view";
	}

}
