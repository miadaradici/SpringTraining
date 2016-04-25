package com.example.spring.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.spring.domain.Person;
import com.example.spring.repository.UserRepository;

@Repository
@Scope("prototype")
public class UserRepositoryImpl implements UserRepository {

	public UserRepositoryImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor!!");
	}
	
	@Override
	public List<Person> list() {
		System.out.println("Aduc toate persoanele din baza de date.");
		List<Person> persons = new ArrayList<>();
		return persons;
	}

	@Override
	public Person get(int id) {
		System.out.println("Aduc o singura persoana din baza de date");
		Person person = new Person();
		return person;
	}

	@Override
	public void save(Person person) {
		System.out.println("Salvez persoana " + person.getFirstname());
	}

}
