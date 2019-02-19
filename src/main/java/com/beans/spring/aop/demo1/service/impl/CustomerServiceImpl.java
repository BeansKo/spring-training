package com.beans.spring.aop.demo1.service.impl;

import com.beans.spring.aop.demo1.service.CustomerService;

/**
 * 目标对象
 * @author Frank
 *
 */
public class CustomerServiceImpl implements CustomerService{

	public void update() {
		System.out.println("更新成功");
	}

	public String add() {
		System.out.println("新增成功");
		return "";
	}

}
