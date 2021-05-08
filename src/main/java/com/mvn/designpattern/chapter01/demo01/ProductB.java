package com.mvn.designpattern.chapter01.demo01;

/**
 * 具体产品类
 */
public class ProductB extends Product{
	
	public ProductB() {
		System.out.println("ProductB 实例化");
	}

	@Override
	public void printProductName() {
		System.out.println("ProductB:"+this.productName);
	}

}
