package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.ProjectEntity;
import com.grownited.Entity.UserEntity;
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
	return"redirect:/listproject";
	}
	@GetMapping("listproject")
	public String listproject(Model model) {
		List<ProjectEntity>poj=projectrepo.findAll();
		model.addAttribute("p", poj);
		return"ListProject";
	}

}


