  package com.grownited.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grownited.Entity.ModuleEntity;
import com.grownited.Entity.ProjectEntity;
import com.grownited.Entity.ProjectStatusEntity;
import com.grownited.Repository.ModuleRepository;
import com.grownited.Repository.ProjectRepository;
import com.grownited.Repository.ProjectStatusRepository;
import com.grownited.Repository.TaskRepository;

@Controller
public class ModuleController {

	@Autowired
	ModuleRepository m;

	@Autowired
	ProjectRepository projectRepo;

	@Autowired
	ProjectStatusRepository projectStatuRepo;

	@Autowired
	TaskRepository taskRepo;

	@GetMapping("/newmodule")
	public String newModule(Model model) {
		List<ProjectEntity> projectList = projectRepo.findAll();
		model.addAttribute("projectList", projectList);

		List<ProjectStatusEntity> projectStatusList = projectStatuRepo.findAll();
		model.addAttribute("projectStatusList", projectStatusList);
		return "NewModule";
	}

	@PostMapping("/savemodule")
	public String saveModule(ModuleEntity module) {
		m.save(module);
		return "redirect:/listmodule?projectId=" + module.getProjectId();
	}

	@GetMapping("/listmodule")
	public String lisrModule(@RequestParam("projectId") Integer projectId, Model model) {
		List<ModuleEntity> modules = m.findByProjectId(projectId);
		ProjectEntity project = projectRepo.findById(projectId).get();
		model.addAttribute("modules", modules);
		model.addAttribute("project", project);
		return "ListModule";
	}
	
	

	@GetMapping("/deletemodule")
	public String deleteModule(@RequestParam("moduleId") Integer moduleId) {
		int projectId = m.findById(moduleId).get().getProjectId();

		if (taskRepo.findByModuleId(moduleId).size() == 0) {
			m.deleteById(moduleId);
		}
		return "redirect:/listmodule?err=true&projectId=" + projectId;
	}

	@GetMapping("/viewmodule")
	public String viewModule(@RequestParam("moduleId") Integer moduleId, Model model) {
		ModuleEntity modules = m.findById(moduleId).get();
		ProjectEntity project = projectRepo.findById(modules.getProjectId()).get();
		model.addAttribute("module", modules);
		model.addAttribute("project", project);
		return "ViewModule";
	}

}
