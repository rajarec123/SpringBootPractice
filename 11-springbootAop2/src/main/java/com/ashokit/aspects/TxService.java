package com.ashokit.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {
	
	/*
	 * @Pointcut("execution(* com.ashokit.dao.EmployeeDao.*())") public void p1() {}
	 * 
	 * @Around("p1()") //join-point public void aroundTest(ProceedingJoinPoint jp) {
	 * System.out.println("Before b.method"); //(1)
	 * 
	 * //code --> call: b.method try { jp.proceed(); //will call b.method (2) //on
	 * success } catch (Throwable e) { //on failure e.printStackTrace(); } //at any
	 * case System.out.println("After b.method"); //(3) }
	 */
	
	@Pointcut("@annotation(com.ashokit.anno.MyTx)(* com.ashokit.dao.EmployeeDao.*())") 
	public void p1() {}
	
	@Before("p1()")
	public void beginTx() {
		System.out.println("Tx Begin");
	}
}