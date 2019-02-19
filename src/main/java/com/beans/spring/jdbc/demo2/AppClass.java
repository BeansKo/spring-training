package com.beans.spring.jdbc.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.spring.jdbc.demo2.service.AccountService;

/**
 * Spring事务注解配置方式
 * @author Frank
 *
 */
public class AppClass {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("./com/beans/spring/jdbc/demo2/applicationContext.xml");
		AccountService accountService = (AccountService)ac.getBean("accountService");
		accountService.translate("zhangsan", "lisi", 10d);
	}
}
