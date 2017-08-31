package com.springinaction.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Cookies implements Dessert {

	@Override
	public void eat() {
		System.out.println("eating cookies ");
	}
}
