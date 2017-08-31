package com.bloomberg.samples.rulemsx;

import java.util.concurrent.ConcurrentHashMap;

public class RuleMSX {

	public enum DataPointState {
		STALE,
		CURRENT
	}

	ConcurrentHashMap<String,DataSet> dataSets;
	
	public RuleMSX() {
		dataSets = new ConcurrentHashMap<String, DataSet>();
	}
	
	public DataSet createDataSet(String name) {
		DataSet newDataSet = new DataSet(name);
		dataSets.put(name, newDataSet);
		return newDataSet;
	}
	
}
