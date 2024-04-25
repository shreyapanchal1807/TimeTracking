package com.grownited.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.grownited.Entity.ModuleEntity;
import com.grownited.Entity.ProjectEntity;
import com.grownited.Entity.ProjectStatusEntity;
import com.grownited.Entity.TaskEntity;
import com.grownited.Entity.UserEntity;
import com.grownited.Repository.ModuleRepository;
import com.grownited.Repository.ProjectRepository;
import com.grownited.Repository.ProjectStatusRepository;
import com.grownited.Repository.TaskRepository;

import jakarta.servlet.http.HttpSession;

@Controller
	public class DevloperController {

		@Autowired
		ProjectRepository projectRepository;

		@Autowired
		ModuleRepository moduleRepository;

		@Autowired
		TaskRepository taskRepository;
		
		@Autowired
		ProjectStatusRepository projectStatusRepository;

		@GetMapping("/developerdashboard")
		public String developerDashboard() {

			return "DeveloperDashboard";

		}

		@GetMapping("myprojects")
		public String myProjects(HttpSession session, Model model) {
			UserEntity user = (UserEntity) session.getAttribute("user");

			List<ProjectEntity> projects = projectRepository.myProjects(user.getUserId());
			model.addAttribute("projects", projects);
			return "MyProjects";
		}

		@GetMapping("devlistmodule")
		public String devListModule(@RequestParam("projectId") Integer projectId, Model model) {
			List<ModuleEntity> modules = moduleRepository.findByProjectId(projectId);
			ProjectEntity project = projectRepository.findById(projectId).get();
			model.addAttribute("modules", modules);
			model.addAttribute("project", project);
			return "DevListModule";
		}

		@GetMapping("/devlisttask")
		public String devListTask(@RequestParam("moduleId") Integer moduleId, Model model) {
			List<TaskEntity> tasks = taskRepository.findByModuleId(moduleId);
			ModuleEntity module = moduleRepository.findById(moduleId).get();
			// findById =>
			ProjectEntity project = projectRepository.findById(module.getProjectId()).get();

			model.addAttribute("task", tasks);
			model.addAttribute("module", module);
			model.addAttribute("project", project);
			return "DevListTask";
		}
		
		
		@GetMapping("/devnewtask")
		public String devNewTask(@RequestParam("moduleId") Integer moduleId, Model model) {
			
			ModuleEntity module = moduleRepository.findById(moduleId).get();
			ProjectEntity project = projectRepository.findById(module.getProjectId()).get();

	 

			List<ProjectStatusEntity> projectStatusList = projectStatusRepository.findAll();
			model.addAttribute("projectStatusList", projectStatusList);
			
			model.addAttribute("module",module);
			model.addAttribute("project",project); 
			
			return "DevNewTask";
		}

	}


