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
	ProjectStatusRepository projectStatusRepo; 
	
	@GetMapping("/newprojectstatus")
	public String newProjectStatus() {
		
		return "NewProjectStatus";
	}
	
	@GetMapping("/listprojectstatus")
	public String listProjectStatus() {
		
		return "ListProjectStatus";
	}

	
	
	@PostMapping("/saveprojectstatus")
	public String saveProjectStatus(ProjectStatusEntity statusEntity) {
		projectStatusRepo.save(statusEntity);
		return "Home";
	}
}
