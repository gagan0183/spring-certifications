package com.app.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {

	@Override
	public void initialize(Phone phone) {
		
	}

	@Override
	public boolean isValid(String s, ConstraintValidatorContext c) {
		if(s == null) {
			return false;
		}
		return s.matches("[0-9()-]*");
	}
}
