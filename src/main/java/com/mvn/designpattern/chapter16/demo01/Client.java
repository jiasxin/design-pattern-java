package com.mvn.designpattern.chapter16.demo01;

public class Client {

	public static void main(String args[]) {

		String instruction = "down run 10 and left move 20";
		InstructionHandler handler = new InstructionHandler();
		handler.handle(instruction);
		String outString = handler.output();
		System.out.println(outString);      //向下快速移动10再向左移动20

	}

}
