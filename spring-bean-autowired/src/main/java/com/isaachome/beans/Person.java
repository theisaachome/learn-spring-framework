package com.isaachome.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Person {
	private String name = "Naomi";
	
	
	private final Parrot parrot;

	@Autowired
	public Person(Parrot parrot) {
		this.parrot = new Parrot();
	}
}
