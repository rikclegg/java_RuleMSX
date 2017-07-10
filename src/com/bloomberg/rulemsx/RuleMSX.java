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
	
	public DataPoint addDataPoint(String name, DataPointSource source) {
		DataPoint newDataPoint = new DataPoint(name, source);
		this.dataPoints.put(name, newDataPoint);
		return newDataPoint;
	}

}
