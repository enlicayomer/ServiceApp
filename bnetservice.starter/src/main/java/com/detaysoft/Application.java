package com.detaysoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.detaysoft.todo.repository.CustomTodoRepository;
//import com.detaysoft.todo.repository.CustomTodoRepositoryFactory;


@SpringBootApplication
//@EnableJpaRepositories(
//	    basePackages = {"com.detaysoft.todo.repository"},
//	    repositoryBaseClass = CustomTodoRepositoryFactory.class)
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}

	
	
}
