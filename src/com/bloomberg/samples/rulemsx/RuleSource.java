package com.bloomberg.samples.rulemsx;

public interface RuleSource {

	public boolean evaluate(DataPoint dataPointL, DataPoint dataPointR);

}
