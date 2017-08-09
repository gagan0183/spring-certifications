package com.springinaction.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		Enjoy enjoy = annotationConfigApplicationContext.getBean(Enjoy.class);
		enjoy.getDessert().eat();
		annotationConfigApplicationContext.close();
	}
}
