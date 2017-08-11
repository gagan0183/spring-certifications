package com.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class ConcertsPerformances implements Performance {

	public ConcertsPerformances() {
		
	}
	
	@Override
	public void perform() {
		System.out.println("performing concerts");
	}
}
