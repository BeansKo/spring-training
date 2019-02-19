package com.beans.spring.aop.demo4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@ComponentScan(value="com.beans.spring.aop.demo4")
@EnableAspectJAutoProxy //开启AOP注解功能
public class SpringConfig {

}
