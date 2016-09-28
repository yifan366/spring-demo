package com.zhongtai.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhongtai.spring_demo.autowire.Address;

public class Mian {

	public static void main(String[] args) {
		
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		Person p3 = (Person) ctx.getBean("person3");
		System.out.println(p3);
		
		Address address = (Address) ctx.getBean("address");
		System.out.println(address);
		
	}
}
