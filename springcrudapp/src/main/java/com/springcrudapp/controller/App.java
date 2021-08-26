package com.springcrudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class App {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("App Controller");
		return "index";
	}
}
