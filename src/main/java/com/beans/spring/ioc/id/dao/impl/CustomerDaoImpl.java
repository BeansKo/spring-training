package com.beans.spring.ioc.id.dao.impl;

import com.beans.spring.ioc.id.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	public void save() {
		System.out.println(name);
		System.out.println("成功保存！");
	}

}
