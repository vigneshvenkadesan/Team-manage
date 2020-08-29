package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String Homepage()
	{
		return "hello";
		
	}
	@GetMapping("/leaders")
	public String showLeaderPage()
	{
		return "leader";
		
	}
	@GetMapping("/admin")
	public String showAdminPage()
	{
		return "admin";
		
	}
}
