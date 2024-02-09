package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.ProjectStatusEntity;
import com.grownited.Entity.UserEntity;
import com.grownited.Repository.ProjectStatusRepository;

@Controller
public class ProjectStatusController {
	@Autowired
	ProjectStatusRepository po;
	
	@GetMapping("/newProjectStatus")
	public String newProjectStatus() 
	{
		return "NewProjectStatus";
		
	}
	@PostMapping("saveProjectStatus")
	public String saveProjectStatus(ProjectStatusEntity statusentity)
	{
		
		po.save(statusentity);
		
		return"redirect:/ProjectStatus";
				
	}
	@GetMapping("listprojectstatus")
	public String listprojectstatus(Model model)
	{
		List<ProjectStatusEntity> pts = po.findAll();
		model.addAttribute("ps", pts);
		return"ListProjectStatus";
	}

}


