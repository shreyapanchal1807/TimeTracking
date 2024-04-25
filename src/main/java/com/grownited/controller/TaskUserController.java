package com.grownited.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.TaskUserEntity;
import com.grownited.Repository.TaskUserRepository;
import com.grownited.Repository.UserRepository;


@Controller
public class TaskUserController {

	@Autowired
	TaskUserRepository taskUserRepo; 
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/assigntask")
	public String newAssignTask(Model model) {
		
		model.addAttribute("users",userRepository.findAll());
		
		return "AssignTask";
	}
	
	@PostMapping("/assigntask")
	public String assignTask(TaskUserEntity taskUser) {
		taskUserRepo.save(taskUser);
		return "redirect:/listtaskuser";
	}
	
	@GetMapping("/listtaskuser")
	public String newListTaskUser() {
		
		return "ListTaskUser";
	}

	
	
	
}
