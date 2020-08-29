package com.spring.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class TeamLoggingAspect {
	
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	
	@Pointcut("execution(* com.spring.controller.*.*(..))")  
	public void forControllerPackage() {}
	
	@Pointcut("execution(* com.spring.dao.*.*(..))")
	public void forDaoPackage() {}
	
	@Pointcut("execution(* com.spring.service.*.*(..))")
	public void forServicePackage() {}
	
	@Pointcut("forControllerPackage() || forDaoPackage()|| forServicePackage()") 
	private void forFlow() {}
	
	
	
	@Before("forFlow()")
	public void BeforeExecution(JoinPoint theJoinPoint)
	{
		String method = theJoinPoint.getSignature().toString();
		
		System.out.println("\n =======> Before Execution "+method);
	}
	
	@AfterReturning(pointcut="forFlow()",returning = "theresult")
	public void AfterExecution(JoinPoint theJoinPoint, Object theresult)
	{
		String method = theJoinPoint.getSignature().toString();
		
		System.out.println("\n =======> After Running Execution "+method);
		System.out.println("\n =======> After Running Execution "+ theresult);
	}

}
