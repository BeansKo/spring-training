package com.beans.spring.ioc.factory.web;

import com.beans.spring.ioc.factory.ioc.BeanFactory;
import com.beans.spring.ioc.factory.service.CustomerService;

public class ActionDemo {

	public static void main(String[] args) {
		//CustomerService service = new CustomerServiceImpl();
		//采用IOC工厂方式
		CustomerService service = (CustomerService)BeanFactory.getBean("customerService");
		service.save();
	}

}
