package com.mvn.designpattern.chapter06.demo03;

/**
 * 懒汉单例模式
 *
 * @author: jiasx
 * @date: 2021年6月27日9:30:34
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    /**
     * 解决线程安全问题，确点每次支持都需要锁定判断
     * @return
     */
    synchronized public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 优化为双重锁定检查  无须对整个方法锁定，只需要对new代码锁定
     * @return
     */
    public static LazySingleton getInstance2() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
