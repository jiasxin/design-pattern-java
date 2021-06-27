package com.mvn.designpattern.chapter12.demo01;
import java.util.*;

/**
 * 3 享元工厂类     围棋棋子工厂类   使用单例模式对其进行设计
 */
public class IgoChessmanFactory {

	private static IgoChessmanFactory instance = new IgoChessmanFactory();

	/**
	 * 使用Hashtable来存储享元对象，充当享元池
	 */
	private static Hashtable hashtable;
	
	private IgoChessmanFactory() {
		hashtable = new Hashtable();
		IgoChessman black,white;
		black = new BlackIgoChessman();
		hashtable.put("b",black);
		white = new WhiteIgoChessman();
		hashtable.put("w",white);
	}

	/**
	 * 返回享元工厂唯一实例
	 * @return
	 */
	public static IgoChessmanFactory getInstance() {
		return instance;
	}

	/**
	 * 通过Key获取存储在Hashtable享元池中的享元对象
	 * @param color
	 * @return
	 */
	public static IgoChessman getIgoChessman(String color) {
		return (IgoChessman)hashtable.get(color);
	}

}