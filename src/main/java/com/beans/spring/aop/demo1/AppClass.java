package com.beans.spring.aop.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.spring.aop.demo1.service.CustomerService;

public class AppClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./com/beans/spring/aop/demo1/applicationContextAopDemo2.xml");
		CustomerService customerService = (CustomerService)applicationContext.getBean("customerService");
		customerService.add();
		customerService.update();
	}

}
