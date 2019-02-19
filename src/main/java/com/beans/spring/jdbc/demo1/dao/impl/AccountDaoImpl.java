package com.beans.spring.jdbc.demo1.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.spring.jdbc.demo1.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {

	//注入JdbcTemplage
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void outMoney(String name, Double money) {
		template.update("update account set money = money-? where UserName=?",money,name);
	}

	public void inMoney(String name, Double money) {
		template.update("update account set money = money+? where UserName=?",money,name);
	}

}
