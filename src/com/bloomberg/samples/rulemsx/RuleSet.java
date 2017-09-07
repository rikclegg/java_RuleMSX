package com.bloomberg.samples.rulemsx;

public class RuleSet extends RuleContainer {
	
	private String name;
	
	RuleSet(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
}
