package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.TaskUserEntity;
import com.grownited.Repository.TaskUserRepository;

@Controller
public class TaskUserController {
	@Autowired
	TaskUserRepository taskuserrepo;
	@GetMapping("newtaskuser")
	public String newtaskuser() {
		return"NewTaskUser";
	}
	@PostMapping("savetaskuser")
	public String savetaskuser(TaskUserEntity taskuserentity) { 
		taskuserrepo.save(taskuserentity);
		return"redirect:/listtaskuser";
	}
	@GetMapping("listtaskuser")
	public String listtaskuser(Model model) {
		List<TaskUserEntity>taskuser=taskuserrepo.findAll();
		model.addAttribute("taskuser",taskuser);
		return"ListTaskUser";
	}

}
