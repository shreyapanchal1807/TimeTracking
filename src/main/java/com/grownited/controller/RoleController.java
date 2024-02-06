package com.grownited.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 
import com.grownited.Entity.RoleEntity;

@Controller
public class RoleController {
	@GetMapping("/newrole")
	public String newrole()
	{
		return "NewRole";
	}
	@PostMapping("/saverole")
	public String saveRole(RoleEntity role)
	{
		System.out.println(role.getRoleName());
		return"Home";
	}

}
