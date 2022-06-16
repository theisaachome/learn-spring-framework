package com.isaachome.aop;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class LogginAspect {
	
	private Logger logger = Logger.getLogger(LogginAspect.class.getName());
	@Around(value="@annotation(ToLog)")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		
		logger.info("Logging Aspect : Calling the intercepted method.");
		
		Object returnByMethod =joinPoint.proceed();
		
		logger.info("Loggin Aspect : Method  executed and returned " + returnByMethod);
		return returnByMethod;
	}
}
