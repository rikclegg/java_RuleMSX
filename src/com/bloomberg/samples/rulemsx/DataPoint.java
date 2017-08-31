package com.bloomberg.samples.rulemsx;

import java.util.ArrayList;

import com.bloomberg.samples.rulemsx.RuleMSX.DataPointState;

public class DataPoint {

	private String name;
	private ArrayList<DataPoint> dependencies;
	private DataPointSource source;
	private DataSet dataSet;
	
	public DataPoint(DataSet dataSet, String name) {
		this.name = name;
		this.dataSet = dataSet;
		this.dependencies = new ArrayList<DataPoint>();
	}

	public String getName() {
		return this.name;
	}
	
	public void setDataPointSource(DataPointSource source) {
		this.source = source;
	}
	
	public DataPointSource getSource() {
		return this.source;
	}

	public DataSet getDataSet() {
		return this.dataSet;
	}
	
	public void addDependency(DataPoint dependency) {
		this.dependencies.add(dependency);
	}
}
