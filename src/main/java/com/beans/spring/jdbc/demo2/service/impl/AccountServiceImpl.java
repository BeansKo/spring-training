package com.beans.spring.jdbc.demo2.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.beans.spring.jdbc.demo2.dao.AccountDao;
import com.beans.spring.jdbc.demo2.service.AccountService;

public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Transactional(isolation=Isolation.DEFAULT)
	public void translate(String outName, String inName, Double money) {
		//从账户扣钱
		accountDao.outMoney(outName, money);
//		int i = 10/0;
		//把钱打入账户
		accountDao.inMoney(inName, money);
	}

}
