package com.bloomberg.samples.rulemsx;

import java.util.ArrayList;

public interface RuleEvaluator {
	public boolean evaluate(DataSet dataSet);
	public ArrayList<String> getDependencies();
}
