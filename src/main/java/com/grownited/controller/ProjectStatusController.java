package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.ProjectStatusEntity;
import com.grownited.Repository.ProjectStatusRepository;

@Controller
public class ProjectStatusController {
	@Autowired
	ProjectStatusRepository po;
	
	@GetMapping("/newProjectStatus")
	public String newProjectStatus() {
		return "NewProjectStatus";
		
	}
	@PostMapping("saveaProjectStatus")
	public String saveProjectStatus(ProjectStatusEntity statusentity) {
		
		po.save(statusentity);
		return "Home";
	}

}
