package com.mvn.designpattern.chapter01.demo01;

/**
 * 产品类
 */
public abstract class Product {
	
	public String productName;
	
	public Product() {
		System.out.println("abstract Product 实例化");
	}
	
	/**
	 * 所有产品类的公共业务方法
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 所有产品类的公共业务方法
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 声明抽象业务方法
	 */
	public abstract void printProductName();
	
}
