package com.mvn.designpattern.chapter06.demo02;

/**
 * @author: jiasx
 * @date: 2021年6月27日8:45:04
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        LoadBlancer instance = LoadBlancer.getInstance();
        instance.addServer("192.168.2.1");
        instance.addServer("192.168.2.2");
        instance.addServer("192.168.2.3");

        System.out.println("-------------------");
        System.out.println(instance);
        for (int i = 0; i < 5; i++) {
            System.out.println(instance.getServer());
        }

        System.out.println("-------------------");
        LoadBlancer instance1 = LoadBlancer.getInstance();
        System.out.println(instance1);
        for (int i = 0; i < 5; i++) {
            System.out.println(instance.getServer());
        }

    }

}
