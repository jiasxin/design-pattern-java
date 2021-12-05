package com.mvn.designpattern.chapter21.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月20日23:07:15
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        Switch s1,s2;
        s1 = new Switch("开关1");
        s2 = new Switch("开关2");
        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.off();

    }

}
