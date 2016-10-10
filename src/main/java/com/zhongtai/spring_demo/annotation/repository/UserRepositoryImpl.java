package com.zhongtai.spring_demo.annotation.repository;

import org.springframework.stereotype.Repository;

import com.zhongtai.spring_demo.annotation.TestObject;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository{

	private TestObject to;
	
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("userRepository save..");
		System.out.println(to);
	}

}
