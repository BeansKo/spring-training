package com.beans.spring.jdbc.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.spring.jdbc.demo3.service.AccountService;
import com.beans.spring.jdbc.demo3.config.SpringConfig;

/**
 * Spring事务零配置方式
 * @author Frank
 *
 */
public class AppClass {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		AccountService accountService = (AccountService)ac.getBean("accountServiceImpl");
		accountService.translate("zhangsan", "lisi", 10d);
	}
}
