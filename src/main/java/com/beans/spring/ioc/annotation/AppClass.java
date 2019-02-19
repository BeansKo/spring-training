package com.beans.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.spring.ioc.annotation.dao.CustomerDao;
import com.beans.spring.ioc.annotation.service.CustomerService;

public class AppClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextDemo4.xml");
		CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao");
		System.out.println(customerDao);
		CustomerService customerService = (CustomerService)ac.getBean("customerService");
		customerService.save();
	}
}
