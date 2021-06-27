package com.mvn.designpattern.chapter08.demo02;

/**
 * @author: jiasx
 * @date: 2021年6月27日12:17:04
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        AbstractImage abstractImage = null;

        abstractImage = new JPGImage();
        abstractImage.setImage(new LinuxImageImpl());
        abstractImage.parseFile("测试");

        abstractImage = new JPGImage();
        abstractImage.setImage(new UnixImageImpl());
        abstractImage.parseFile("测试");

        abstractImage = new JPGImage();
        abstractImage.setImage(new WindowsImageImpl());
        abstractImage.parseFile("测试");

        System.out.println("----------------");

        abstractImage = new JPGImage();
        abstractImage.setImage(new WindowsImageImpl());
        abstractImage.parseFile("测试");

        abstractImage = new GIFImage();
        abstractImage.setImage(new WindowsImageImpl());
        abstractImage.parseFile("测试");

        abstractImage = new BMPImage();
        abstractImage.setImage(new WindowsImageImpl());
        abstractImage.parseFile("测试");

    }

}
