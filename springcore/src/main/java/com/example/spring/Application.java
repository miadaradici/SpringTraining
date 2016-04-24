package com.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.spring.config.AppContext;
import com.example.spring.config.Config;
import com.example.spring.controller.UserController;
import com.example.spring.domain.Person;

public class Application {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// fac legatura dintre UserRepository si UserServiceAppContextImpl folosind ApplicationContextAware
		AppContext appContext = context.getBean(AppContext.class) ;
		appContext.setUserRepository();
		
		
		UserController userController = context.getBean(UserController.class);
		Person person = new Person();
		userController.createUser(person);
		
		
		
		/*List<ConfigRunner> runnerList = new ArrayList<>();
		runnerList.add(new JavaConfigRunner());
		
		for(ConfigRunner configRunner : runnerList){
			configRunner.run();
		}*/
	}
}
