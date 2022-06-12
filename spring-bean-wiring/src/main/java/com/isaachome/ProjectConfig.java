package com.isaachome;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
	
	@Bean
	public Parrot parrot() {
		var parrot = new Parrot();
		parrot.setName("Miki");
		return parrot;
	}
	
	@Bean
	public Person person() {
		var person = new Person();
		person.setName("John ");
		person.setParrot(parrot());
		return person;
	}

}
