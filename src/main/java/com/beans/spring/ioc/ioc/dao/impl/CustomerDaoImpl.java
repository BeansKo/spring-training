package com.beans.spring.ioc.ioc.dao.impl;

import com.beans.spring.ioc.ioc.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao{

	public void init() {
		System.out.println("init...");
	}
	
	public void save() {
		System.out.println("save...");
	}
	
	public void destroy() {
		System.out.println("close...");
	}
}
