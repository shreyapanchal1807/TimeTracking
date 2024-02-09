package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.TaskEntity;
import com.grownited.Repository.TaskRepository;

@Controller
public class TaskController {
	@Autowired
	TaskRepository taskRepo;
	@GetMapping("/newtask")
	public String newtask() {
		return"NewTask";
	}
	@PostMapping("/savetask")
	public String saveTask(TaskEntity task) {
		taskRepo.save(task);
		return"redirect:/listtask";
	}
	@GetMapping("listtask")
	public String listtask(Model model) {
		List<TaskEntity> task=taskRepo.findAll();
		model.addAttribute("t",task);
		return"ListTask";
		
		
	}

}
