package com.springinaction.knights;

import java.io.PrintStream;

public class Minstrels {
	private PrintStream stream;
	
	public Minstrels(PrintStream stream) {
		this.stream = stream;
	}
	
	public void singBeforequest() {
		stream.println("The knight is so brave!");
	}
	
	public void singAfterquest() {
		stream.println("The p embarks on the quest");
	}
}
