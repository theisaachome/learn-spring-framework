package com.isaachome.aop;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.isaachome.model.Comment;

@Aspect
public class LogginAspect {
	
	private Logger logger = Logger.getLogger(LogginAspect.class.getName());
	@Around("execution(* com.isaachome.services.*.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		Object [] arguments = joinPoint.getArgs();
		
		logger.info("Method " + methodName + 
				" with parameters " + Arrays.asList(arguments)
				+ " will execute.");
		Comment comment = new Comment();
		comment.setAuthor("IsaacHome");
		comment.setText("Intercepted Comment...");
		Object [] newArguments = {comment};
		
		Object returnByMethod =joinPoint.proceed(newArguments);
		
		logger.info("Method  executed and returned " + returnByMethod);
		return "FAILED";
	}
}
