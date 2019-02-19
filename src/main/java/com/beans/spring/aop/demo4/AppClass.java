package com.beans.spring.aop.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.spring.aop.demo4.config.SpringConfig;
import com.beans.spring.aop.demo4.service.CustomerService;

/**
 * 零配置方式
 * @author Frank
 *
 */
public class AppClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		CustomerService customerService = (CustomerService)ac.getBean("customerService");
		customerService.update();
		customerService.save(10);
	}

}
