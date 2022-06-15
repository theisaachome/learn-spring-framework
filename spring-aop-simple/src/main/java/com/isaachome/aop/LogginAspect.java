package com.isaachome.aop;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogginAspect {
	
	private Logger logger = Logger.getLogger(LogginAspect.class.getName());
	@Around("execution(* com.isaachome.services.*.*(..))")
	public void log(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("Method will execute");
		joinPoint.proceed();
		logger.info("Method  executed");
	}
}
