package com.isaachome.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Parrot {
	private String name="Anna";
	private final Person person;
	
	@Autowired
	public Parrot(Person person) {
			this.person = person;
	}
}
