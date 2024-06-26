package com.grownited.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.RoleEntity;
import com.grownited.Entity.UserEntity;
import com.grownited.Repository.RoleRepository;
import com.grownited.Repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepo;

	@Autowired
	RoleRepository roleRepo;

	@Autowired
	BCryptPasswordEncoder bcrypt;
	
	@GetMapping("/newuser")
	public String newUser(Model model) {
		List<RoleEntity> roleList = roleRepo.findAll();
		model.addAttribute("roleList", roleList);
		return "NewUser";
	}

	@PostMapping("/saveuser")
	public String saveUser(UserEntity user) {

		user.setPassword(bcrypt.encode(user.getPassword()));		 
		userRepo.save(user);// insert

		return "redirect:/listuser";
	}

	@GetMapping("/listuser")
	public String listUser(Model model) {
		List<UserEntity> listUser = userRepo.findAll();
		model.addAttribute("listUser", listUser);
		return "ListUser";
	}

}
