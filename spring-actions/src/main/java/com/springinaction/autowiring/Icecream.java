package com.springinaction.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Icecream implements Dessert {

	@Override
	public void eat() {
		System.out.println("eating icecream");
	}
}
