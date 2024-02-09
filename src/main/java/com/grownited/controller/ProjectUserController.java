package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.ProjectEntity;
import com.grownited.Entity.ProjectUserEntity;
import com.grownited.Repository.ProjectStatusRepository;
import com.grownited.Repository.ProjectUserRepository;

@Controller
public class ProjectUserController {
	@Autowired
	ProjectUserRepository projectuserRepo;
	@GetMapping("/projectuser")
	public String newProjectUSer()
	{
		return"projectuser";
	}
	@PostMapping("/saveprojectuser")
	public String saveprojectuser( ProjectUserEntity projectuser) {
		projectuserRepo.save(projectuser);
		return"redirect:/listtask";
	}
	@GetMapping("ListProjectUser")
	public String listprojectuser(Model model) {
		List<ProjectUserEntity>ProjectUser=projectuserRepo.findAll();
		model.addAttribute("pu",ProjectUser);
		return"ListProjectUser";
		
		
		
	}
	

}
