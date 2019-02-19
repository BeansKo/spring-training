package com.beans.spring.aop.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.spring.aop.demo3.service.CustomerService;

/**
 * 注解方式
 * @author Frank
 *
 */
public class AppClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("./com/beans/spring/aop/demo3/applicationContextAopDemo3.xml");
		CustomerService customerService = (CustomerService)ac.getBean("customerService");
		customerService.update();
		customerService.save(10);
	}

}
