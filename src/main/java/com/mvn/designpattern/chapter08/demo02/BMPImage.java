package com.mvn.designpattern.chapter08.demo02;

/**
 * 4 扩充抽象类 BMP
 */
public class BMPImage extends AbstractImage {

    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        image.doPaint(matrix);
        System.out.println("["+fileName+"]" + "格式为BMP");
    }

}