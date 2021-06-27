package com.mvn.designpattern.chapter08.demo02;

/**
 * 4 扩充抽象类 JPG
 */
public class JPGImage extends AbstractImage {

	public void parseFile(String fileName) {
      //模拟解析
      Matrix matrix = new Matrix();
      image.doPaint(matrix);
      System.out.println("["+fileName+"]" + "格式为JPG");
  }

}
