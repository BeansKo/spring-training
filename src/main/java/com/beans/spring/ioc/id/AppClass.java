package com.beans.spring.ioc.id;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.spring.ioc.id.service.CustomerService;

public class AppClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextDemo3.xml");
		CustomerService customerService = (CustomerService)ac.getBean("customerService");
//		customerService.save();
		//注入不同的数据类型
		System.out.println(customerService);
	}

}
