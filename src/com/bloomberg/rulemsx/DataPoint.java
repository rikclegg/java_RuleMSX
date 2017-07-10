package com.bloomberg.rulemsx;

import java.util.ArrayList;

import com.bloomberg.rulemsx.RuleMSX.DataPointState;

public class DataPoint {

	private String name;
	private DataPointState state;
	private ArrayList<DataPoint> dependencies;
	private DataPointSource source;

	public DataPoint(String name, DataPointSource source) {
		this.name = name;
		this.state = DataPointState.STALE;
		this.dependencies = new ArrayList<DataPoint>();
		this.source = source;
	}

	public String getName() {
		return this.name;
	}
	
	public DataPointState getState() {
		return this.state;
	}
	
	public DataPointSource getSource() {
		return this.source;
	}

}
