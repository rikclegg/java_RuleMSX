package com.bloomberg.samples.rulemsx;

import com.bloomberg.samples.rulemsx.RuleMSX.DataPointState;

public interface DataPointSource {

	public Object getValue();
	public DataPointState getState();
	public void setState(DataPointState state);

}
