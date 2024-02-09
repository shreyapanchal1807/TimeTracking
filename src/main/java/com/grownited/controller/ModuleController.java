package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.ModuleEntity;
import com.grownited.Repository.ModuleRepository;


@Controller
public class ModuleController {
	@Autowired
	ModuleRepository modulRepo;
	
	@GetMapping("/newmodule")
	public String newModule() {
		return "NewModule";
	}

	@PostMapping("/savemodule")
	public String savemodule(ModuleEntity module) {
		// TODO: process POST request
		modulRepo.save(module);
		return "redirect:/listmodule";
	}

	@GetMapping("listmodule")
	public String listmodule(Model model) {
		List<ModuleEntity> mod=modulRepo.findAll();
		model.addAttribute("m", mod);
		return "ListModule";

	}

}