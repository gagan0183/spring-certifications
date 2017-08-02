package com.constructorinjections;

public class ComplexBeanImpl implements ComplexBean {
	private SimpleBean simpleBean;
	private boolean complex;

	public ComplexBeanImpl(SimpleBean simpleBean) {
		System.out.println("complexbeans instantions");
		this.simpleBean = simpleBean;
	}

	public ComplexBeanImpl(SimpleBean simpleBean, boolean comp) {
		this.simpleBean = simpleBean;
		this.complex = comp;
	}

	public SimpleBean getSimpleBean() {
		return simpleBean;
	}

	public boolean isComplex() {
		return complex;
	}
}
