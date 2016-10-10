package com.zhongtai.spring_demo.aop;

public class Main {

	public static void main(String[] args) {
		
		AtithmeticCalculator atithmeticCalculator = new AtithmeticCalculatorImpl();
		
		AtithmeticCalculator proxy = new AtithmeticCalculatorLogingProxy(atithmeticCalculator).getLogingProxy();
		
		int result = proxy.add(1, 2);
		System.out.println(result);		
		
	}
}
