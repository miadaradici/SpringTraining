package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.spring.domain.Person;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Service
@Qualifier("userServiceUsingConstructorInj")
public class UserServiceConstructImp implements UserService{

	private UserRepository userRepository;
	
	@Autowired // Using constructor Injection
	UserServiceConstructImp (UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public List<Person> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub
		
	}

}
