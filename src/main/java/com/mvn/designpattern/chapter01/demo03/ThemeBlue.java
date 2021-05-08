package com.mvn.designpattern.chapter01.demo03;

/**
 *  蓝色主题 
 */
public class ThemeBlue implements Theme{

	public ThemeBlue() {
		System.out.println("设置为蓝色主题");
	}
	
	public void display() {
		System.out.println("显示蓝色主题");
	}
	
}
