package com.zhongtai.spring_demo.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("beans-generid-di.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		
		userService.save();
	}
}
