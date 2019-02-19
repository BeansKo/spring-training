package com.beans.spring.ioc.id.domain;

public class Customer {
	private String name;
	private String gender;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + "]";
	}
}
