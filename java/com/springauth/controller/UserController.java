package com.springauth.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springauth.dto.userDto;
import com.springauth.service.UserService;

@RestController
@RequestMapping("home")
public class UserController {

	@Autowired
	private UserService service;
	
	
	@GetMapping("/users")
	public List<userDto> getUsers(){
		return service.getUser();
		
	}
	
	@GetMapping("/currentUser")
	public String loggedInUser(Principal principal) {
		return principal.getName();
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> adminUser(){
		return ResponseEntity.ok("Hi, I am a admin");
	}
	
	@GetMapping("/normal")
	public ResponseEntity<String> normalUser(){
		return ResponseEntity.ok("Hi, I am a normal user");
	}
	
	@GetMapping("/public")
	public ResponseEntity<String> publicUser(){
		return ResponseEntity.ok("Hi, I am a public user");
	}
	@GetMapping("/login")
	String login() {
		return "login";
	}
	
}
