package com.springinaction.knights;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
	
	private PrintStream stream;
	
	private double value;
	
	public SlayDragonQuest(PrintStream stream, double value) {
		this.stream = stream;
		this.value = value;
	}

	@Override
	public void embark() {
		System.out.println("Embarking on quest to slay the dragon : " + value);
	}
}
