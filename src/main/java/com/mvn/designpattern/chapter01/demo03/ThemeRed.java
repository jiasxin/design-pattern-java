package com.mvn.designpattern.chapter01.demo03;

/**
 *  红色主题 
 */
public class ThemeRed implements Theme{

	public ThemeRed() {
		System.out.println("设置为红色主题");
	}
	
	public void display() {
		System.out.println("显示红色主题");
	}
	
}
