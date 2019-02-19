package com.beans.spring.ioc.annotationzero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.spring.ioc.annotation.dao.CustomerDao;
import com.beans.spring.ioc.annotation.service.CustomerService;
import com.beans.spring.ioc.annotationzero.config.SpringConfig;

public class AppClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		CustomerDao customerDao = (CustomerDao)ac.getBean("customerDao");
		System.out.println(customerDao);
		CustomerService customerService = (CustomerService)ac.getBean("customerService");
		customerService.save();
	}
}
