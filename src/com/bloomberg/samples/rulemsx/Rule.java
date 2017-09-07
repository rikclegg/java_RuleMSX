package com.bloomberg.samples.rulemsx;

import java.util.ArrayList;

public class Rule extends RuleContainer {
	
	private String name;
	private RuleEvaluator evaluator;
	private ArrayList<RuleAction> actions = new ArrayList<RuleAction>();
	private ArrayList<String> dependencies = new ArrayList<String>();
	
	public Rule(String name, RuleEvaluator evaluator) {
		this.name = name;
		this.evaluator = evaluator;
	}

	public Rule(String name, RuleEvaluator evaluator, RuleAction action) {
		this.name = name;
		this.evaluator = evaluator;
		this.actions.add(action);
	}
	
	public String getName() {
		return this.name;
	}
	
	public RuleEvaluator getEvaluator() {
		return this.evaluator;
	}

	public ArrayList<RuleAction> getActions() {
		return actions;
	}
	
	public void addDependency(String dataPointName) {
		this.dependencies.add(dataPointName);
	}
}
