package com.zzy.demo.spring.service;

import com.zzy.demo.spring.IUserService;

public class UserService implements IUserService{
	public void doAService() {
		System.out.println("this is a service");
	}
}
