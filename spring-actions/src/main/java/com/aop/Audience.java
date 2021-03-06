package com.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	
	@Pointcut("execution(* *.perform(..))")
	public void perform() {}
	
	@Before("perform()")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones");
	}
	
	@Before("perform()")
	public void takeSeats() {
		System.out.println("taking seats");
	}
	
	@AfterReturning("perform()")
	public void applause() {
		System.out.println("CLAP");
	}
	
	@AfterThrowing("perform()")
	public void notapptheperfom() {
		System.out.println("not app the perfom");
	}
}
