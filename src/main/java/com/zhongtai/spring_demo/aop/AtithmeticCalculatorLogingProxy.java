package com.zhongtai.spring_demo.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理实现日志
 * @author Administrator
 *
 */
public class AtithmeticCalculatorLogingProxy {

	
	//要代理的对象
	private AtithmeticCalculator target;
	
	public AtithmeticCalculatorLogingProxy(AtithmeticCalculator target) {

		 this.target=target;
	}
	
	public AtithmeticCalculator getLogingProxy(){
		
		AtithmeticCalculator  proxy = null;
		
		ClassLoader loader = target.getClass().getClassLoader();
		
		Class[] interfaces = new Class[]{AtithmeticCalculator.class};
		
		InvocationHandler h = new InvocationHandler() {
			
			public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
				// TODO Auto-generated method stub
				String methodName = arg1.getName();
				System.out.println("invoke methodName:"+methodName);
				
				Object result = arg1.invoke(target, arg2);
				
				return result;
			}
		};
		
		proxy = (AtithmeticCalculator)Proxy.newProxyInstance(loader, interfaces, h);
		
		
		return proxy;
		
	}
}
