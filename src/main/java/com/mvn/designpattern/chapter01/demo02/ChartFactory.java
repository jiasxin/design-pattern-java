package com.mvn.designpattern.chapter01.demo02;

/**
 * 图 建造工厂
 */
public class ChartFactory {

	/**
	 * 静态图形建造工厂
	 * @return 具体图形
	 */
	public static Chart getChart(ChartEnum chartEnum) {
		Chart chart = null;
		if(ChartEnum.HISTOGRAM.getCode().equals(chartEnum.getCode())) {
			chart = new ChartHistogram();
		}else if(ChartEnum.LINE.getCode().equals(chartEnum.getCode())) {
			chart = new ChartLine();
		}else if(ChartEnum.PIE.getCode().equals(chartEnum.getCode())) {
			chart = new ChartPie();
		}
		return chart;
	}
	
}
