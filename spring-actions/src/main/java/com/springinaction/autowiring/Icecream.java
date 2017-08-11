package com.springinaction.autowiring;

import org.springframework.stereotype.Component;

@Component
@Cold
public class Icecream implements Dessert {

	@Override
	public void eat() {
		System.out.println("eating icecream");
	}
}
