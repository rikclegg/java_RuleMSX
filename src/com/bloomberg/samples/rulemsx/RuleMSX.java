package com.bloomberg.samples.rulemsx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class RuleMSX {

	public enum DataPointState {
		STALE,
		CURRENT
	}

	ArrayList<DataSet> dataSets;
	ArrayList<RuleSet> ruleSets;
	
	public RuleMSX() {
		dataSets = new ArrayList<DataSet>();
		ruleSets = new ArrayList<RuleSet>();
	}
	
	public DataSet createDataSet(String name) {
		DataSet newDataSet = new DataSet(name);
		dataSets.add(newDataSet);
		return newDataSet;
	}
	
	public RuleSet createRuleSet(String name) {
		RuleSet newRuleSet = new RuleSet(name);
		ruleSets.add(newRuleSet);
		return newRuleSet;
	}
	
	public ArrayList<DataSet> getDataSets() {
		return this.dataSets;
	}
	
	public ArrayList<RuleSet> getRuleSets() {
		return this.ruleSets;
	}

}
