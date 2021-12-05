package com.mvn.designpattern.chapter20.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月15日21:32:50
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendPrice(double price) {
        System.out.println(name + "接收到系统推送股价，现在是：" + String.valueOf(price) + "$");
    }

}
