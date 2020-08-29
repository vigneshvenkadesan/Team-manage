package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	
	@GetMapping("/showMyLogin")
	public String showMyLogin() {
		return "fancy-login";
	}
	@GetMapping("/accessDeniedHandler")
	public String showDeniedPage()
	{
		return "accessDenied";
		
	}
}
