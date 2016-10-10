package com.zhongtai.spring_demo.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

	@Autowired
	private BaseRepository<User> baseRepository;
	
	public void save(){
		System.out.println("BaseService save..");
		System.out.println(baseRepository);
	}
}
