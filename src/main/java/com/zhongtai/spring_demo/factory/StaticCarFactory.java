package com.zhongtai.spring_demo.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：
 * 直接调用某一个类的静态方法就可以返回bean的实例
 * @author Administrator
 *
 */
public class StaticCarFactory {

	private static Map<String, Car> cars = new HashMap<String, Car>();
	
	static{
		cars.put("audi", new Car("audi", "shanghai", 500000));
		cars.put("ford", new Car("ford", "guangzhou", 300000));
	}
	
	//静态方法
	public static Car getcar(String name){
		return cars.get(name);
	}
}
