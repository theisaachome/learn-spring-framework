package com.isaachome;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.isaachome.bean.Parrot;

public class Main {

	public static void main(String[] args) {
		var context = 
				new AnnotationConfigApplicationContext(ProjectConfig.class);
		Parrot p = context.getBean("miki",Parrot.class);
		System.out.println(p.getName());
		var s = context.getBean(String.class);
		System.out.println(s);
		var i = context.getBean(Integer.class);
		System.out.println(i);
	}
}
