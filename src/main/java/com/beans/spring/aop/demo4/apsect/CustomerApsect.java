package com.beans.spring.aop.demo4.apsect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 注解版本的切面类
 * @author Frank
 */
@Component
@Aspect
public class CustomerApsect {
	/**
	 * 前置通知
	 */
	@Before(value="execution(public * com.beans.spring.aop.demo4.service.CustomerService.*(..))")
	public void beforeNotice() {
		System.out.println("前置通知...");
	}
	
	/**
	 * 最终通知
	 */
	@After(value="execution(public * com.beans.spring.aop.demo4.service.CustomerService.*(..))")
	public void afterNotice() {
		System.out.println("最终通知...");
	}
	
	/**
	 * 后置通知
	 */
	@AfterReturning(value="execution(public * com.beans.spring.aop.demo4.service.CustomerService.*(..))")
	public void afterNoticeReturn() {
		System.out.println("后置通知...");
	}
	
	/**
	 * 异常通知
	 */
	@AfterThrowing(value="execution(public * com.beans.spring.aop.demo4.service.CustomerService.*(..))")
	public void ExceptionNotice() {
		System.out.println("异常通知...");
	}
	
	/**
	 * 环绕通知
	 * @param pjp
	 */
	@Around(value="execution(public * com.beans.spring.aop.demo4.service.CustomerService.*(..))")
	public void aroundNotice(ProceedingJoinPoint pjp) {
		System.out.println("开始环绕通知...");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("结束环绕通知...");
	}
}
