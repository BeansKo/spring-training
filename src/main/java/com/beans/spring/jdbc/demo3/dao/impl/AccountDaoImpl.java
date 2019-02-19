package com.beans.spring.jdbc.demo3.dao.impl;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.beans.spring.jdbc.demo3.dao.AccountDao;

@Repository
public class AccountDaoImpl implements AccountDao {

	//注入JdbcTemplage
	@Resource
	private JdbcTemplate template;


	public void outMoney(String name, Double money) {
		template.update("update account set money = money-? where UserName=?",money,name);
	}

	public void inMoney(String name, Double money) {
		template.update("update account set money = money+? where UserName=?",money,name);
	}

}
