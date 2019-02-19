package com.beans.spring.jdbc.demo1.service.impl;

import com.beans.spring.jdbc.demo1.dao.AccountDao;
import com.beans.spring.jdbc.demo1.service.AccountService;

public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void translate(String outName, String inName, Double money) {
		//从账户扣钱
		accountDao.outMoney(outName, money);
//		int i = 10/0;
		//把钱打入账户
		accountDao.inMoney(inName, money);
	}

}
