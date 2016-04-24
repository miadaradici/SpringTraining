package com.example.spring.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.spring.controller.UserController;
import com.example.spring.domain.ClassPrototype;
import com.example.spring.domain.Person;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Configuration
@ComponentScan("com.example.spring") // search the ... package for @Component classes
public class Config {
	
	/*@Bean
	public UserController createUserController(){
		System.out.println("dau un bean user controller");
		return new UserController();
	}*/
	
	/*@Bean 
	public AppContext createAppContext(){
		return new AppContext();
	}*/
	
	@Bean
	@Scope("prototype")
	public ClassPrototype createClassPrototype(){
		return new ClassPrototype();
	}
	
	@Bean 
	@Qualifier("userServiceBean")
	public UserService createUserService(){
		return new UserService(){
			
			@Autowired
			UserRepository userRepository ;
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
		};
	}
	
}
