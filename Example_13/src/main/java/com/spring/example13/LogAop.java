package com.spring.example13;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureStr = joinPoint.getSignature().toString();
		System.out.println(signatureStr + " is start.");

		long st = System.currentTimeMillis();

		try {
			Object object = joinPoint.proceed();
			return object;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (et - st));
		}
	}
}
