package com.mvn.designpattern.chapter15.demo01;

public class Client {

	public static void main(String args[]) {

		FunctionButton fb = new FunctionButton();
		Command command;
		command = (Command)XMLUtil.getBean();
		
		fb.setCommand(command);
		fb.click();


		test2();
	}

	private static void test2() {

		FunctionButton functionButton = null;
		Command command = null;

		functionButton = new FunctionButton();
		command = new ExitCommand();
		functionButton.setCommand(command);
		functionButton.click();

		functionButton = new FunctionButton();
		command = new HelpCommand();
		functionButton.setCommand(command);
		functionButton.click();

	}

}