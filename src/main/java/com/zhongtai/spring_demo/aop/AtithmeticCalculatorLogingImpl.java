package com.zhongtai.spring_demo.aop;

public class AtithmeticCalculatorLogingImpl implements AtithmeticCalculator{

	public int add(int i, int j) {
		System.out.println("方法执行之前：[i:"+i+",j:"+j+"]");
		int result = i+j;
		System.out.println("方法执行后结果："+result);
		return result;
	}

	public int sub(int i, int j) {
		int result = i-j;
		return result;
	}

	public int mul(int i, int j) {
		int result = i*j;
		return result;
	}

	public int div(int i, int j) {
		int result = i/j;
		return result;
	}

}
