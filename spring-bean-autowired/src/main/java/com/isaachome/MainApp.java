package com.isaachome;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.isaachome.beans.Parrot;
import com.isaachome.beans.Person;

public class MainApp {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var parrot = context.getBean(Parrot.class);
		var person = context.getBean(Person.class);
		System.out.println("Person : "+person.getName());
		System.out.println("Person's parrot : "+person.getParrot().getName());
	}
}
