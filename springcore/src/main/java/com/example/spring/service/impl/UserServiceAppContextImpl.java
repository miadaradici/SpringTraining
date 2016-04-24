package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.spring.domain.ClassPrototype;
import com.example.spring.domain.Person;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Service
@Qualifier("userServiceUsingAppContext")
public class UserServiceAppContextImpl implements UserService{

	private UserRepository userRepository;
	
	@Autowired
	ClassPrototype clProto;

	
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
		userRepository.save(person);
	}

	public void setUserRepository(UserRepository userRepository){
		this.userRepository = userRepository;
	}

}
