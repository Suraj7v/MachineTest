package com.Example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services {
	@RequestMapping("welcome")
	String welcome() {
		return "Welcome to spring!!";
	}

}
