package com.bloomberg.samples.rulemsx;

import java.util.ArrayList;

abstract class RuleContainer {
	
	protected ArrayList<Rule> rules = new ArrayList<Rule>();

	public void addRule(Rule newRule) {
		rules.add(newRule);
	}

	public ArrayList<Rule> getRules() {
		return this.rules;
	}
	
	public Rule getRule(String name) {
		for(Rule r: this.rules) {
			if(r.getName().equals(name)) return r;
		}
		return null;
	}
}
