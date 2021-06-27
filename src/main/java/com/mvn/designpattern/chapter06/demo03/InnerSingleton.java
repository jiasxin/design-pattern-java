package com.mvn.designpattern.chapter06.demo03;

/**
 * 使用IoDH模式实现单例模式,可以延迟加载，又不用加锁影响系统性能
 *
 * @author: jiasx
 * @date: 2021年6月27日9:38:40
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class InnerSingleton {

    public InnerSingleton() {
    }

    private static class HolderClass {

        private final static InnerSingleton instance = new InnerSingleton();

    }

    public static InnerSingleton getInstance() {
        return HolderClass.instance;
    }

}
