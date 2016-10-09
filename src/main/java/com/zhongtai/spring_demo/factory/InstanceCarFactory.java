package com.zhongtai.spring_demo.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法：实例工厂的方法。 即现需要创建工厂本身，再调用工厂的实例方法来返回bean的实例
 * @author Administrator
 *
 */
public class InstanceCarFactory {

	private Map<String, Car> cars = null;
	
	public InstanceCarFactory() {
		
		cars = new HashMap<String, Car>();
		cars.put("audi", new Car("audi", "shanghai", 500000));
		cars.put("ford", new Car("ford", "guangzhou", 300000));
	}
	
	public Car getcar(String name){
		return cars.get(name);
		
	}
}
