package com.constructorinjections;

public class SimpleBeanImpl implements SimpleBean {

	public SimpleBeanImpl() {
		System.out.println("Simplebeanimpls instantiation");
	}

	@Override
	public String toString() {
		return "SimpleBeanImpl " + hashCode();
	}
}
