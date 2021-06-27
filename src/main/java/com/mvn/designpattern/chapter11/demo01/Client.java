package com.mvn.designpattern.chapter11.demo01;

/**
 * 测试外观模式
 */
public class Client {

	public static void main(String args[]) {


		EncryptFacade ef = new EncryptFacade();
		ef.fileEncrypt("src\\main\\java\\com\\mvn\\designpattern\\chapter11\\demo01\\src.txt","src\\main\\java\\com\\mvn\\designpattern\\chapter11\\demo01\\des.txt");

		/*
		AbstractEncryptFacade ef;
		ef = (AbstractEncryptFacade)XMLUtil.getBean();
		ef.fileEncrypt("src\\main\\java\\com\\mvn\\designpattern\\chapter11\\demo01\\src.txt",
				"src\\main\\java\\com\\mvn\\designpattern\\chapter11\\demo01\\des.txt");
		*/

	}

}
