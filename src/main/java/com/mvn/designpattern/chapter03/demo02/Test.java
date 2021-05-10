package com.mvn.designpattern.chapter03.demo02;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {

        Theme theme = null;

        theme = new MacTheme();
        theme.createButton().display();
        theme.createMenu().display();

        theme = new WindowsTheme();
        theme.createButton().display();
        theme.createMenu().display();

    }

}
