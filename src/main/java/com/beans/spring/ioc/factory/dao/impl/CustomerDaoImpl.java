package com.beans.spring.ioc.factory.dao.impl;

import com.beans.spring.ioc.factory.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao{

	public void save() {
		System.out.println("数据保存到数据库");
	}

}
