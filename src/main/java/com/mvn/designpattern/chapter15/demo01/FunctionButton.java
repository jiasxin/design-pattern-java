package com.mvn.designpattern.chapter15.demo01;

/**
 * 请求发生者      功能键类 ， 充当请求调用者
 */
public class FunctionButton {

	/**
	 * 维持一个抽象命令对象的引用
	 */
	private Command command;

	/**
	 * 为功能注入命令
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 发送请求的方法
	 */
	public void click() {
		System.out.println("单机功能键");
		command.execute();
	}

}
