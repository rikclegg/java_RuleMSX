package com.bloomberg.samples.rulemsx;

import java.util.concurrent.ConcurrentHashMap;

public class DataSet {
	
	private String name;
	private ConcurrentHashMap<String, DataPoint> dataPoints;
	
	DataSet(String name) {
		this.name = name;
		this.dataPoints = new ConcurrentHashMap<String,DataPoint>();
	}

	public DataPoint addDataPoint(String name) {
		
		DataPoint newDataPoint = new DataPoint(this, name);
		dataPoints.put(name,  newDataPoint);
		return newDataPoint;
	}
	
	public String getName() {
		return this.name;
	}
}
