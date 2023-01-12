package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.aopDemo.DemoConfig;
import com.example.demo.dao.AccountDao;

//@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringAopApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
//		getting the Bean 
		
		
		AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
		
		
		accountDao.addAccount();
		

		context.close();
	}

}
