package com.springinaction.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Enjoy {
	
	private Dessert dessert;
	
	@Autowired
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	public Dessert getDessert() {
		return dessert;
	}
}
