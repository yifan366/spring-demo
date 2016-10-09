package com.zhongtai.spring_demo.factorybean;

import org.springframework.beans.factory.FactoryBean;
/**
 * 自定义的FactoryBean需要实现FactoryBean接口
 * @author Administrator
 *
 */
public class CarFactoryBean implements FactoryBean<Car>{

	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand, "zhongguo", 150000);
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
