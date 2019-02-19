package com.beans.spring.ioc.annotation.dao.impl;

import org.springframework.stereotype.Repository;

import com.beans.spring.ioc.annotation.dao.CustomerDao;

//@Component //默认名称为类名（首字母小写）：customerDaoImpl 等同于<bean id="customerDaoImpl" class=""></bean>
@Repository(value="customerDao2")
public class CustomerDaoImpl2 implements CustomerDao {
	public void save() {
		System.out.println("保存2OK!");
	}
}
