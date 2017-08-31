package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		ConcertsPerformances concertsPerformances = annotationConfigApplicationContext.getBean(ConcertsPerformances.class);
		concertsPerformances.perform();
	}
}
