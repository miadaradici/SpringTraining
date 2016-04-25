package com.example.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.impl.UserServiceAppContextImpl;

@Component
public class AppContext implements ApplicationContextAware {

	private ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx = arg0;
		
	}

	public void setUserRepository() {
		UserServiceAppContextImpl userService = ctx.getBean(UserServiceAppContextImpl.class);
		UserRepository userRepository = ctx.getBean(UserRepositoryImpl.class);
		
		userService.setUserRepository(userRepository);
	}
}
