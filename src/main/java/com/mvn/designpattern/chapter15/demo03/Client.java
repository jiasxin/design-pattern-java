package com.mvn.designpattern.chapter15.demo03;


public class Client {

	public static void main(String args[]) {

		CommandQueue commandQueue = null;
		Invoker invoker = null;

		commandQueue = new CommandQueue();
		commandQueue.addCommand(new HelpCommand());
		commandQueue.addCommand(new ExitCommand());

		invoker = new Invoker();
		invoker.setCommandQueue(commandQueue);
		invoker.call();

	}

}