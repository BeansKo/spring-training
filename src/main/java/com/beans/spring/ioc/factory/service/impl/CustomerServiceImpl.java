package com.beans.spring.ioc.factory.service.impl;

import com.beans.spring.ioc.factory.dao.CustomerDao;
import com.beans.spring.ioc.factory.ioc.BeanFactory;
import com.beans.spring.ioc.factory.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	//传统方式,采用new的方式创建对象。弊端：耦合性太强，修改源代码
	//private CustomerDao customerDao = new CustomerDaoImpl();
	//采用IOC工厂方式
	private CustomerDao customerDao = (CustomerDao)BeanFactory.getBean("customerDao");
	public void save() {
		customerDao.save();
	}

}
