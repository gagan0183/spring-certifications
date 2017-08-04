package com.constructorinjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContexts = new ClassPathXmlApplicationContext("classpath:sample-config1.xml");
		for (String beanName : applicationContexts.getBeanDefinitionNames()) {
			System.out.println(beanName + " " + applicationContexts.getBean(beanName).getClass().getSimpleName());
		}
	}
}
