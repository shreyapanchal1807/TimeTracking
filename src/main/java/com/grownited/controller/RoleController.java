 

package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 import com.grownited.Entity.RoleEntity;
import com.grownited.Repository.RoleRepository;

@Controller
public class RoleController {
	@Autowired
	RoleRepository RoleRepo;
	
	@GetMapping("/newrole")
	public String newrole()
	{
		return "NewRole";
	}
	@PostMapping("/saverole")
	public String saveRole(RoleEntity role)
	{
		System.out.println(role.getRoleName());
		RoleRepo.save(role);
		
		return"redirect:/listrole";
	}
	@GetMapping("listrole")
	public String listrole(Model model) {
		List<RoleEntity>roles=RoleRepo.findAll();
		model.addAttribute("r", roles);
		return"ListRole";
	}

}
