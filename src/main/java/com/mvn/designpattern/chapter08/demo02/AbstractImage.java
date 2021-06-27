package com.mvn.designpattern.chapter08.demo02;

/**
 * 3 抽象类 抽象图像类
 */
public abstract class AbstractImage {

	/**
	 * 图像操作平台接口
	 */
	protected Image image;

	public void setImage(Image image) {
		this.image = image;
	}

	public abstract void parseFile(String fileName);

}