package com.spring.example14;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("expression=within(com.spring.example14.*)")
	private void pointcutMethod() {
		System.out.println("pointcutMethod()");
	}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start.");
		long st = System.currentTimeMillis();
		
		try {
			Object object = joinPoint.proceed();
			return object;
		}
		finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}
	}
	
	@Before("within(com.spring.example14.*)")
	public void beforeAdvice() {
		System.out.println("beforeAdvice()");
	}

}
