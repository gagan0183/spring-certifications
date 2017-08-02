package com.constructorinjections;

public class ComplexBean2Impl implements ComplexBean {
	private SimpleBean simpleBean1;
	private SimpleBean simpleBean2;

	public ComplexBean2Impl(SimpleBean simpleBean1, SimpleBean simpleBean2) {
		System.out.println("complexbeans instantions");
		this.simpleBean1 = simpleBean1;
		this.simpleBean2 = simpleBean2;
	}

	public SimpleBean getSimpleBean1() {
		return simpleBean1;
	}

	public void setSimpleBean1(SimpleBean simpleBean1) {
		this.simpleBean1 = simpleBean1;
	}

	public SimpleBean getSimpleBean2() {
		return simpleBean2;
	}

	public void setSimpleBean2(SimpleBean simpleBean2) {
		this.simpleBean2 = simpleBean2;
	}
}
