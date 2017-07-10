package com.bloomberg.rulemsx;

public interface RuleSource {

	public boolean evaluate(DataPoint dataPointL, DataPoint dataPointR);

}
