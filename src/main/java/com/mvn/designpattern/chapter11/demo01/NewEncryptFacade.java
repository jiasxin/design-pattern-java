package com.mvn.designpattern.chapter11.demo01;

/**
 * 3 外观类 加密外观类
 */
public class NewEncryptFacade extends AbstractEncryptFacade {

	//维持对子系统对象的引入
	private NewCipherMachine cipher;
	private FileReader reader;
	private FileWriter writer;

	public NewEncryptFacade() {
		cipher = new NewCipherMachine();
		reader = new FileReader();
		writer = new FileWriter();
	}
	
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr,fileNameDes);
	}

}