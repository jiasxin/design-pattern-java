package com.mvn.designpattern.chapter06.demo01;

/**
 * @author: jiasx
 * @date: 2021年6月27日8:35:54
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Singleton {

    /**
     * 静态私有成员变量
     */
    private static Singleton instance = null;

    public Singleton(){}

    /**
     * 静态公有工厂方法、返回唯一实例名称
     * @return
     */
    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
