package com.isaachome;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.isaachome.aop.LogginAspect;
import com.isaachome.aop.SecurityAspect;

@Configuration
@ComponentScan(basePackages = "com.isaachome.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	public LogginAspect logginAspect() {
		return new LogginAspect();
	}
	
	@Bean
	public SecurityAspect securityAspect() {
		return new SecurityAspect();
	}
}
