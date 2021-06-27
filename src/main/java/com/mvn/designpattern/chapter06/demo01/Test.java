package com.mvn.designpattern.chapter06.demo01;

/**
 * @author: jiasx
 * @date: 2021年6月27日8:38:25
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();

        System.out.println(instance);

        instance = Singleton.getInstance();

        System.out.println(instance);

    }

}
