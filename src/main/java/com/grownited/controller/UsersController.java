package com.grownited.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.Entity.RoleEntity;
import com.grownited.Entity.UserEntity;
import com.grownited.Repository.UserRepository;

@Controller
public class UsersController {
@Autowired
UserRepository usersrepo;

@GetMapping("/newusers")
public String newusers(UserEntity user) {
	return"NewUsers";
}
@PostMapping("saveusers")
public String saveusers(UserEntity userentity) {
	//TODO:process POST request
	usersrepo.save (userentity);
	return"redirect:/listuser";
}
@GetMapping("listuser")
public String listuser(Model model) {
	List<UserEntity>us=usersrepo.findAll();
	model.addAttribute("u", us);
	return"ListUser";
}

}


