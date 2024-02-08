package com.grownited.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	return"Home";
}

}
