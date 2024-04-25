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
import com.grownited.Entity.TaskEntity;
import com.grownited.Repository.ModuleRepository;
import com.grownited.Repository.ProjectRepository;
import com.grownited.Repository.ProjectStatusRepository;
import com.grownited.Repository.TaskRepository;



@Controller
public class TaskController {

	@Autowired
	TaskRepository taskRepo;

	@Autowired
	ModuleRepository moduleRepo;

	@Autowired
	ProjectRepository projectRepo;

	@Autowired
	ProjectStatusRepository projectStatuRepo;

	@GetMapping("/newtask")
	public String newTask(@RequestParam("moduleId") Integer moduleId, Model model) {

		ModuleEntity module = moduleRepo.findById(moduleId).get();
		ProjectEntity project = projectRepo.findById(module.getProjectId()).get();

		List<ProjectStatusEntity> projectStatusList = projectStatuRepo.findAll();
		model.addAttribute("projectStatusList", projectStatusList);

		model.addAttribute("module", module);
		model.addAttribute("project", project);

		return "NewTask";
	}

	@PostMapping("/savetask")
	public String svaeTask(TaskEntity task) {
		taskRepo.save(task);
		return "redirect:/listtask?moduleId=" + task.getModuleId();
	}

	@GetMapping("/listtask")
	public String listTask(@RequestParam("moduleId") Integer moduleId, Model model) {
		List<TaskEntity> tasks = taskRepo.findByModuleId(moduleId);
		ModuleEntity module = moduleRepo.findById(moduleId).get();
		// findById =>
		ProjectEntity project = projectRepo.findById(module.getProjectId()).get();

		model.addAttribute("task", tasks);
		model.addAttribute("module", module);
		model.addAttribute("project", project);
		return "ListTask";
	}

	@GetMapping("/deletetask")
	public String deleteTask(@RequestParam("taskId") Integer taskId) {
		int moduleId = taskRepo.findById(taskId).get().getModuleId();
		taskRepo.deleteById(taskId);
		return "redirect:/listtask?moduleId=" + moduleId;
	}
	

	@GetMapping("/viewtask")
	public String viewTask(@RequestParam("taskId") Integer taskId, Model model) {
		TaskEntity task = taskRepo.findById(taskId).get();
		ModuleEntity module = moduleRepo.findById(task.getModuleId()).get();
		ProjectEntity project = projectRepo.findById(task.getProjectId()).get();

		model.addAttribute("task", task);
		model.addAttribute("project", project);
		model.addAttribute("module", module);

		return "ViewTask";
	}

}
