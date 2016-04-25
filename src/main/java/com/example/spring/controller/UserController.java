package com.example.spring.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.spring.domain.ClassPrototype;
import com.example.spring.domain.Person;
import com.example.spring.service.UserService;

@Controller
public class UserController {

	@Autowired
	@Qualifier("userServiceBean")
	//@Qualifier("userServiceUsingAppContext")
	//@Qualifier("userServiceUsingConstructorInj")
	//@Qualifier("userServiceWithComponent")
	UserService userService ;
	
	@Autowired
	ClassPrototype clProto;

	public UserController(){
		System.out.println("construct");
	}
	
	@PostConstruct
	public void construct() {
		System.out.println("postcontruct");
	}

	public void createUser(Person person) {
		// call UserService here
		userService.save(person);
	}
	
	
}
