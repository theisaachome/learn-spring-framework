package com.isaachome;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.isaachome.bean.Parrot;

@Configuration
public class ProjectConfig {

	@Bean(name="isaac")
	public Parrot parrot1() {
		var p = new Parrot();
		p.setName("Isaac Home");
		return p;
	}
	@Bean(value="miki")
	public Parrot parrot2() {
		var p = new Parrot();
		p.setName("Miki");
		return p;
	}
	@Bean("riki")
	public Parrot parrot3() {
		var p = new Parrot();
		p.setName("Riki");
		return p;
	}
	@Bean
	public String herro() {
		return "Hello new bean";
	}
	@Bean
	public Integer age() {
		return 10;
	}
}
