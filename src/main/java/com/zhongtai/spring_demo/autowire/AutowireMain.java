package com.zhongtai.spring_demo.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自动装配测试类
 * @author Administrator
 *
 */
public class AutowireMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person p = (Person) ctx.getBean("person4");
		
		System.out.println(p);
	}
}
