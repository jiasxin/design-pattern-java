package com.mvn.designpattern.chapter01.demo02;

/**
 * 线形图
 */
public class ChartLine implements Chart{

	public ChartLine() {
		System.out.println("创建线形图");
	}
	
	public void display() {
		System.out.println("显示线形图");
	}
	
}
