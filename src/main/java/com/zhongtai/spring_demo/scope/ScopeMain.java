package com.zhongtai.spring_demo.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhongtai.spring_demo.Car;

/**
 * beas的作用域
 * @author Administrator
 *
 */
public class ScopeMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		
		Car car1 = (Car) ctx.getBean("car");
		
		Car car2 = (Car) ctx.getBean("car");
		
		System.out.println(car1 == car2);
		
	}
}
