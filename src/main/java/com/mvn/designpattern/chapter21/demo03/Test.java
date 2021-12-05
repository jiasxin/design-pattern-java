package com.mvn.designpattern.chapter21.demo03;

/**
 * @author: jiasx
 * @date: 2021年9月20日23:30:28
 * @description: 使用环境类实现状态切换测试
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();

    }

}
