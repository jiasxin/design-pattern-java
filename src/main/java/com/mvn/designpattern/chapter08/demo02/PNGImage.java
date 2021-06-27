package com.mvn.designpattern.chapter08.demo02;

/**
 * 4 扩充抽象类 PNG
 */
public class PNGImage extends AbstractImage {

    public void parseFile(String fileName) {
        //模拟解析
        Matrix matrix = new Matrix();
        image.doPaint(matrix);
        System.out.println(fileName + "格式为PNG");
    }

}