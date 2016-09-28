package com.zhongtai.spring_demo.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhongtai.spring_demo.Car;

/**
 * spring bean 之间关系
 * @author Administrator
 *
 */
public class RelationMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		
		Car car1 = (Car) ctx.getBean("car1");
		System.out.println(car1);
		
		Car car2 = (Car) ctx.getBean("car2");
		System.out.println(car2);
	}
}
