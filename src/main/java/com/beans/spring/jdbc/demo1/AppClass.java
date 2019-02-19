package com.beans.spring.jdbc.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.spring.jdbc.demo1.service.AccountService;

/**
 * Spring事务XML配置方式
 * @author Frank
 *
 */
public class AppClass {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("./com/beans/spring/jdbc/demo1/applicationContext.xml");
		AccountService accountService = (AccountService)ac.getBean("accountService");
		accountService.translate("zhangsan", "lisi", 10d);
	}
}
