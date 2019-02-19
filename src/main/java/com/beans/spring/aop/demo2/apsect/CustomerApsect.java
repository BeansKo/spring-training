package com.beans.spring.aop.demo2.apsect;

import org.aspectj.lang.ProceedingJoinPoint;

public class CustomerApsect {
	/**
	 * 前置通知
	 */
	public void beforeNotice() {
		System.out.println("前置通知...");
	}
	
	/**
	 * 最终通知
	 */
	public void afterNotice() {
		System.out.println("最终通知...");
	}
	
	/**
	 * 后置通知
	 */
	public void afterNoticeReturn() {
		System.out.println("后置通知...");
	}
	
	/**
	 * 异常通知
	 */
	public void ExceptionNotice() {
		System.out.println("异常通知...");
	}
	
	/**
	 * 环绕通知
	 * @param pjp
	 */
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
