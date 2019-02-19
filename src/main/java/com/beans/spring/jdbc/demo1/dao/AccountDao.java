package com.beans.spring.jdbc.demo1.dao;

public interface AccountDao {
	void outMoney(String name, Double money);
	void inMoney(String name, Double money);
}
