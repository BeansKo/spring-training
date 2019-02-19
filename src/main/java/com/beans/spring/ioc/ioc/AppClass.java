package com.beans.spring.ioc.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.beans.spring.ioc.ioc.dao.CustomerDao;

public class AppClass {

	public static void main(String[] args) {
		//初始化SpringIOC容器
		//类路径方式
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//文件路径方式，相对路径
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("./src/main/resources/applicationContext.xml");
		CustomerDao customerDao = (CustomerDao)context.getBean("customerDao");
		customerDao.save();
		//单例或多例演示
		for(int i=0;i<5;i++){
			System.out.println((CustomerDao)context.getBean("customerDao"));
		}
		//手动销毁对象
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
