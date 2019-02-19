package com.beans.spring.jdbc.demo1.domain;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = 9095967504537331172L;
	
	private int id;
	private String userName;
	private double money;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", userName=" + userName + ", money=" + money + "]";
	}
}
