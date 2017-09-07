package com.bloomberg.samples.rulemsx;

public class RuleSet extends RuleContainer {
	
	private String name;
	
	RuleSet(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void execute(DataSet dataSet) {
		
		executeRules(this, dataSet);
		
	}
	
	private void executeRules(RuleContainer source, DataSet dataSet) {
		
		for(Rule r: source.rules) {
			if(r.getEvaluator().evaluate(dataSet)) {
				for(RuleAction a: r.getActions()) {
					a.execute(dataSet);
				}
				executeRules(r, dataSet);
			}
		}
	}
}
