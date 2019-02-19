package com.beans.spring.framework;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.beans.spring.ioc.annotation.service.CustomerService;
import com.beans.spring.ioc.annotationzero.config.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringConfig.class})
public class Demo5 {
	
	@Resource
	CustomerService customerService;
	
	@Test
	public void test1() {
		customerService.save();
	}
	
	@Test
	public void test2(){
		System.out.println("ok");
	}
}
