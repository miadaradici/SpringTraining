package com.example.spring.repository;

import java.util.List;

import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.spring.domain.Person;

@Repository
@Scope("prototype")

public interface UserRepository {
	List<Person> list();
	Person get(int id);
	void save(Person person);
}
