package com.bloomberg.rulemsx;

import java.util.concurrent.ConcurrentHashMap;

public class RuleMSX {

	public enum DataPointState {
		STALE,
		CURRENT
	}

	ConcurrentHashMap<String,DataPoint>  dataPoints;
	
	public RuleMSX() {
		dataPoints = new ConcurrentHashMap<String, DataPoint>();
	}
	
}
