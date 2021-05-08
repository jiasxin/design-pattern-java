package com.mvn.designpattern.chapter01.demo01;

/**
 * 测试类
 */
public class Test {

	public static void main(String[] args) {
		
		Product product = null;
		product = ProductFactory.getProduct("A");
		product.printProductName();
		product = ProductFactory.getProduct("B");
		product.printProductName();
		
	}
	
}
