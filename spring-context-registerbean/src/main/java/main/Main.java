package main;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		var context = new 
				AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Parrot p = new Parrot();
		p.setName("Riki");
		
		
		Supplier<Parrot> supplierParrot = () -> p;
		
		context.registerBean(
				"parrot", 
				Parrot.class,
				supplierParrot,
				bc-> bc.setPrimary(true));
		
		var parrot = context.getBean(Parrot.class);
		System.out.println(parrot.getName());
	}
}
