package com.ashokit.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {
	
	@Pointcut("execution(public void com.ashokit.dao.EmployeeDao.saveEmployee())")
	public void p1() {}
	
	@Before("p1()")  //join-point
	public void beginTx() {
		System.out.println("Tx Started..!");	
	}
	
	/* @After("p1()")  //join-point
	public void sendReport() {
		System.out.println("Report Send!");	
	} */
	
	@AfterReturning("p1()") 
	public void commitTx() {
		System.out.println("Tx is committed..!");
	}
	
	@AfterThrowing(value = "p1()", throwing = "th") 
	public void rollbackTx(Throwable th) {
		System.out.println("Tx is rollback. " +th.getMessage());
	}
}