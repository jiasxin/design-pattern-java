package com.mvn.designpattern.chapter01.demo01;

/**
 * 具体产品类
 */
public class ProductA extends Product{
	
	public ProductA() {
		System.out.println("ProductA 实例化");
	}

	@Override
	public void printProductName() {
		System.out.println("ProductA:"+this.productName);
	}

}
