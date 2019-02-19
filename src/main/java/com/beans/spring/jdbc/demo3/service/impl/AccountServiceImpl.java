package com.beans.spring.jdbc.demo3.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.beans.spring.jdbc.demo3.dao.AccountDao;
import com.beans.spring.jdbc.demo3.service.AccountService;

@Service
//@Transactional(isolation=Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService{

	@Resource
	private AccountDao accountDao;

	@Transactional(isolation=Isolation.DEFAULT)
	public void translate(String outName, String inName, Double money) {
		//从账户扣钱
		accountDao.outMoney(outName, money);
//		int i = 10/0;
		//把钱打入账户
		accountDao.inMoney(inName, money);
	}

}
