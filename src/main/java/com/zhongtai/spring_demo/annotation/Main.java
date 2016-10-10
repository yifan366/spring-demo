package com.zhongtai.spring_demo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhongtai.spring_demo.annotation.controller.UserController;
import com.zhongtai.spring_demo.annotation.repository.UserRepository;

public class Main {

	
	
	
	public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		 
		 /*TestObject to = (TestObject) ctx.getBean("testObject");
		 System.out.println(to);
		 
		 UserRepository userRepository = (UserRepository) ctx.getBean("userRepository"); 
		 System.out.println(userRepository);*/
		 
		 UserController uc = (UserController) ctx.getBean("userController");
		 uc.excute();
	}
}
