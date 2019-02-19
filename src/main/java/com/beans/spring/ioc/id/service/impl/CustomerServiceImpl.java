package com.beans.spring.ioc.id.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.beans.spring.ioc.id.dao.CustomerDao;
import com.beans.spring.ioc.id.domain.Customer;
import com.beans.spring.ioc.id.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	
	public CustomerServiceImpl(){}
	
	//构造方法注入
	public CustomerServiceImpl(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	//setter方法注入
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	//1.普通数据类型
	private String gender;
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//2.JavaBean数据类型
	private Customer customer;
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	//3.数组类型
	private String[] addresses;
	public void setAddresses(String[] addresses) {
		this.addresses = addresses;
	}
	
	//4.List集合
	private List<Customer> customerList;
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	//5.map集合
	private Map<String, Customer> customerMap;
	public void setCustomerMap(Map<String, Customer> customerMap) {
		this.customerMap = customerMap;
	}
	
	//6.Properties
	private Properties customerProp;
	public void setCustomerProp(Properties customerProp) {
		this.customerProp = customerProp;
	}

	public void save() {
		customerDao.save();
	}

	@Override
	public String toString() {
		return "CustomerServiceImpl [gender=" + gender + ", customer=" + customer + ", addresses="
				+ Arrays.toString(addresses) + ", customerList=" + customerList + ", customerMap=" + customerMap
				+ ", customerProp=" + customerProp + "]";
	}
}
