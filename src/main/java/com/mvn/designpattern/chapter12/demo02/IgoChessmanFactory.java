package com.mvn.designpattern.chapter12.demo02;
import java.util.*;

/**
 * 3 享元工厂类     围棋棋子工厂类   使用单例模式对其进行设计
 */
public class IgoChessmanFactory {

	private static IgoChessmanFactory instance = new IgoChessmanFactory();

	/**
	 * 使用Hashtable做为享元池存储棋子
	 */
	private static Hashtable hashtable;

	/**
	 * 类实例化时初始化享元池中黑子与白子
	 */
	private IgoChessmanFactory() {
		hashtable = new Hashtable();
		IgoChessman black,white;
		black = new BlackIgoChessman();
		hashtable.put("b",black);
		white = new WhiteIgoChessman();
		hashtable.put("w",white);
	}

	public static IgoChessmanFactory getInstance() {
		return instance;
	}

	public static IgoChessman getIgoChessman(String color) {
		return (IgoChessman)hashtable.get(color);
	}

}