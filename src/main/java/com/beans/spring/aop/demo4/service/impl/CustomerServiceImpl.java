package com.beans.spring.aop.demo4.service.impl;

import org.springframework.stereotype.Service;

import com.beans.spring.aop.demo4.service.CustomerService;

@Service(value="customerService")
public class CustomerServiceImpl implements CustomerService{
	public String save(int age) {
		int num = age/1;
		System.out.println("执行save方法..."+num);
		return String.valueOf(age);
	}
	
	public void update(){
		System.out.println("执行update方法...");
	}
}
