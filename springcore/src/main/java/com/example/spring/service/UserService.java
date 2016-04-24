package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.domain.Person;

@Service
public interface UserService {
	
	List<Person> list();
	Person get(int id);
	void save(Person person);
}
