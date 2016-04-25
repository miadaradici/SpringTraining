package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.domain.Person;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Person> list() {
		return userRepository.list();
	}

	@Override
	public Person get(int id) {
		return userRepository.get(id);
	}

	@Override
	public void save(Person person) {
		userRepository.save(person);
	}
}
