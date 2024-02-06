package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

 import com.grownited.Entity.UserEntity;

@Controller
public class SessionController {
	@GetMapping("/")
	public String welcome() {
		return"Welcome";
		
	}
	@GetMapping("/signup")
	public String signUp() {
		return"SignUp";
	}
	@GetMapping("/login")
	public String login() {
		return"LogIn";
	}
	@PostMapping("/saveuser")
	public String saveuser(UserEntity user) {
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassWord());
		
		System.out.println("SaveUser");
		return"Home";
	}
	
	

}

