package com.mvn.designpattern.chapter01.demo01;

/**
 * 产品工厂
 */
public class ProductFactory {
	
	/**
	 * 静态工厂方法
	 * @param productName
	 * @return
	 */
	public static Product getProduct(String productName) {
		Product product = null;
		if(productName.equalsIgnoreCase("A")) {
			//初始化设置product
			product = new ProductA();
			product.setProductName(productName);
		}else if(productName.equalsIgnoreCase("B")) {
			//初始化设置product
			product = new ProductB();
			product.setProductName(productName);
		}
		return product;
	}
	
}



