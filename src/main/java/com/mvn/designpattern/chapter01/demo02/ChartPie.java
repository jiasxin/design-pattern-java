package com.mvn.designpattern.chapter01.demo02;

/**
 * 饼形图
 */
public class ChartPie implements Chart{

	public ChartPie() {
		System.out.println("创建饼状图");
	}
	
	public void display() {
		System.out.println("显示饼状图");
	}
	
}
