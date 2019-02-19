package com.beans.spring.aop.demo2.service;

public class CustomerService {
	
	public String save(int age) {
		int num = age/0;
		System.out.println("执行save方法..."+num);
		return String.valueOf(age);
	}
	
	public void update(){
		System.out.println("执行update方法...");
	}

}
