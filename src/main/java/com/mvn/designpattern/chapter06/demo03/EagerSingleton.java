package com.mvn.designpattern.chapter06.demo03;

/**
 * 饿汉单例模式
 *
 * @author: jiasx
 * @date: 2021年6月27日9:28:56
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
