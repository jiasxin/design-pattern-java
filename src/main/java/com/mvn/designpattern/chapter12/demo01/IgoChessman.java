package com.mvn.designpattern.chapter12.demo01;

/**
 * 1 抽象享元类     围棋棋子类
 */
public abstract class IgoChessman {

	public abstract String getColor();

	public void display() {
		System.out.println("棋子颜色" + this.getColor());
	}

}
