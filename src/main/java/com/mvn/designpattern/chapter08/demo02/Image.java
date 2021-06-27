package com.mvn.designpattern.chapter08.demo02;

/**
 * 1 抽象操作实现类   实现类接口
 */
public interface Image {

	/**
	 * 显示像素矩阵
	 * @param m
	 */
	public void doPaint(Matrix m);

}
