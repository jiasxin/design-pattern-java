package com.mvn.designpattern.chapter11.demo01;

/**
 * 2 外观类 加密外观类
 */
public class EncryptFacade {

	//维持对子系统对象的引入
	private CipherMachine cipher;
	private FileReader reader;
	private FileWriter writer;

	public EncryptFacade() {
		cipher = new CipherMachine();
		reader = new FileReader();
		writer = new FileWriter();
	}
	
	//调用子系统对象业务方法
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr,fileNameDes);
	}

}