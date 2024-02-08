package com.grownited.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.ProjectEntity;
import com.grownited.Repository.ProjectRepository;

@Controller
public class ProjectController {
	@Autowired
	ProjectRepository projectrepo;
	
@GetMapping("/project")
public String project() {
	return"project";
}
@PostMapping("path")
public String saveproject(ProjectEntity projectentity) {
	projectrepo.save(projectentity);
	return"Home";
}

}
