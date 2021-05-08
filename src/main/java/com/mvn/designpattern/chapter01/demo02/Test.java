package com.mvn.designpattern.chapter01.demo02;

/**
 * 测试类
 * @describe 
 * 通过变更静态工厂参数就可以得到对应得图形
 * 
 * @date 2021年5月7日22:50:50
 * @author jiasx
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Chart chart = null;
		chart = ChartFactory.getChart(ChartEnum.HISTOGRAM);
		chart.display();
		chart = ChartFactory.getChart(ChartEnum.LINE);
		chart.display();
		chart = ChartFactory.getChart(ChartEnum.PIE);
		chart.display();
		
	}
	
}
