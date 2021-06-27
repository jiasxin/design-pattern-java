package com.mvn.designpattern.chapter08.demo02;

public class Client {

    public static void main(String args[]) {
        AbstractImage image;
        Image impl;
        image = (AbstractImage) XMLUtil.getBean("image");
        impl = (Image) XMLUtil.getBean("os");
        image.setImage(impl);
        image.parseFile("测试");
    }

}