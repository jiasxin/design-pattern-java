package com.mvn.designpattern.chapter15.demo02;

/**
 * 抽象命令类
 */
public abstract class AbstractCommand {

	/**
	 * 执行命令
	 * @param value
	 * @return
	 */
	public abstract int execute(int value);

	/**
	 * 撤销
	 * @return
	 */
	public abstract int undo();

}

