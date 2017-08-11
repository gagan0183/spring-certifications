package com.springinaction.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		Enjoy enjoy = annotationConfigApplicationContext.getBean(Enjoy.class);
		System.out.println(enjoy);
		enjoy.getDessert().eat();
		
		Enjoy enjoy1 = annotationConfigApplicationContext.getBean(Enjoy.class);
		System.out.println(enjoy1);
		Scopes scopes = annotationConfigApplicationContext.getBean(Scopes.class);
		System.out.println(scopes);
		Scopes scopes1 = annotationConfigApplicationContext.getBean(Scopes.class);
		System.out.println(scopes1);
		annotationConfigApplicationContext.close();
	}
}
