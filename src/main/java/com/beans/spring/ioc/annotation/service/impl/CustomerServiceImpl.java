package com.beans.spring.ioc.annotation.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.beans.spring.ioc.annotation.dao.CustomerDao;
import com.beans.spring.ioc.annotation.service.CustomerService;

@Service(value="customerService")
public class CustomerServiceImpl implements CustomerService {

	//1.注入普通类型
	@Value("frank")
	private String name;
	
	@Value("${url}")
	private String url;
	
	//2.JavaBean注入
	/**
	 * 1)自动根据类型进行注入，直接赋值给变量（无须提供构造方法或者setter方法）
	 * 2)如果Spring环境中没有提供任何一个CustomerDao的类型，那么会注入失败
	 * 3)如果Spring环境中出现了多个CustomerDao的类型，那么也会注入失败，这时候可以配合@Qualifier使用
	 */
//	@Autowired
//	@Qualifier(value="customerDao2")
	@Resource(name="customerDao2")
	private CustomerDao customerDao;
	
	@PostConstruct
	public void init() {
		System.out.println("init...");
	}
	
	public void save() {
		System.out.println(name);
		System.out.println(url);
		customerDao.save();
	}

}
