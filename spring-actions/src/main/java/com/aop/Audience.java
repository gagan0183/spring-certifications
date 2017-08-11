package com.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
	
	@Before("execution(** com.aop.perform(..)")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones");
	}
	
	@Before("execution(** com.aop.perform(..)")
	public void takeSeats() {
		System.out.println("taking seats");
	}
	
	@AfterReturning("execution(** com.aop.perform(..))")
	public void applause() {
		System.out.println("CLAP");
	}
	
	@AfterThrowing("execution(** com.aop.perform(..))")
	public void notapptheperfom() {
		System.out.println("not app the perfom");
	}
}
