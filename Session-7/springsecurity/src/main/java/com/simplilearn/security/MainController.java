package com.simplilearn.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String Hello() {
		return "Hello World";
	}
	@GetMapping("/protected")
	public String loggedInUser() {
		return "I am a registered User and my account is protected";
	}
	@GetMapping("/admin")
	public String adminUser() {
		return "Hello From Admin";
	}
}
