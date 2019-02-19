package com.beans.spring.aop.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.spring.aop.demo2.service.CustomerService;

/**
 * AOP的XML配置方式
 * @author Frank
 *
 */
public class AppClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("./com/beans/spring/aop/demo2/applicationContextAopDemo3.xml");
		CustomerService customerService = (CustomerService)ac.getBean("customerService");
		customerService.update();
		customerService.save(10);
	}

}
