package com.qc.qcr.pf.filter;

import java.util.Arrays;
import com.qc.qcr.pf.filter.RangeFilter;
import com.qc.qcr.sensor.domain.HeartRateData;
import com.qc.qcr.sensor.domain.SensorData;

public class IntegerBetweenRangeFilterTest extends AbstractDataFilterTest<SensorData<Integer>, SensorData<Integer>> {

	public IntegerBetweenRangeFilterTest() {
		super(new RangeFilter(80, 100));
		HeartRateData hr1 = new HeartRateData(10);
		HeartRateData hr2 = new HeartRateData(40); 
		HeartRateData hr3 = new HeartRateData(60);
		HeartRateData hr4 = new HeartRateData(80);
		HeartRateData hr5 = new HeartRateData(99);
		HeartRateData hr6 = new HeartRateData(100);
		HeartRateData hr7 = new HeartRateData(110);
		setInputData(Arrays.asList(hr1,hr2,hr3,hr4,hr5,hr6,hr7));
		setExpectedOutput(Arrays.asList(hr4,hr5,hr6));
		}
}
