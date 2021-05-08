package com.mvn.designpattern.chapter01.demo02;

/**
 * 柱状图
 */
public class ChartHistogram implements Chart{

	public ChartHistogram() {
		System.out.println("创建柱状图");
	}
	
	public void display() {
		System.out.println("显示柱状图");
	}
	
}
