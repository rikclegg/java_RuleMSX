package com.bloomberg.rulemsx;

public class Rule {
	
	private String name;
	private RuleSource source;
	private RuleAction action;
	
	public Rule(String name, RuleSource source, RuleAction action) {
		this.name = name;
		this.source = source;
		this.action = action;
	}
	
	public String getName() {
		return this.name;
	}
	
	public RuleSource getSource() {
		return this.source;
	}

	public RuleAction getAction() {
		return this.action;
	}
	
	public boolean evaluate(DataPoint dataPointL, DataPoint dataPointR) {
		if(this.source.evaluate(dataPointL, dataPointR)) {
			return this.action.execute(dataPointL);
		} else return false;
		
	}
}
