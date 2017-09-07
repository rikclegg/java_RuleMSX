package com.bloomberg.samples.rulemsx;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class RuleMSX {

	public enum DataPointState {
		STALE,
		CURRENT
	}

	ConcurrentHashMap<String,DataSet> dataSets;
	ConcurrentHashMap<String,RuleSet> ruleSets;
	
	public RuleMSX() {
		dataSets = new ConcurrentHashMap<String, DataSet>();
	}
	
	public DataSet createDataSet(String name) {
		DataSet newDataSet = new DataSet(name);
		dataSets.put(name, newDataSet);
		return newDataSet;
	}
	
	public RuleSet createRuleSet(String name) {
		RuleSet newRuleSet = new RuleSet(name);
		ruleSets.put(name, newRuleSet);
		return newRuleSet;
	}
	
	public Iterator<DataSet> getDataSets() {
		return this.dataSets.values().iterator();
	}
	
	public Iterator<RuleSet> getRuleSets() {
		return this.ruleSets.values().iterator();
	}
}
