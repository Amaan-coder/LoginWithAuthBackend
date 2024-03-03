package com.springauth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springauth.dao.userDao;
import com.springauth.dto.userDto;
import com.springauth.dto.roleDto;


@Service
public class UserService {
	
	@Autowired 
	private userDao dao;
	
//	@PostConstruct
//	public void setUser() {
//		userDto dto = new userDto();
//		
//		dto.setFirstName("Mohd");
//		dto.setLastName("Mohd Amaan");
//		dto.setEmail("mohd.amaan@tcs.com");
//		dto.setPassword("admin");
//		dto.setRole(roleDto.Admin);
//		
//		dao.save(dto);
//	}
	
	private List<userDto> store = new ArrayList<userDto>();
	
	public UserService() {
		store.add(new userDto("Mohd","Amaan","amaan@gmail.com","Admin123",roleDto.Admin));
		store.add(new userDto("XYZ","Abc","abc@tcs.com","abc",roleDto.User));
	}

	public List<userDto> getUser(){
		return this.store;
	}
	
}
