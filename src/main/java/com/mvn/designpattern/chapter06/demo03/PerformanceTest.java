package com.mvn.designpattern.chapter06.demo03;

/**
 * @author: jiasx
 * @date: 2021年6月27日9:44:01
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class PerformanceTest {

    public static void main(String[] args) {

        int num = 10000;
        long startTime ,consumingTime;
        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            EagerSingleton instance = EagerSingleton.getInstance();
        }
        consumingTime = System.nanoTime() - startTime;
        System.out.println("获取"+num+"个实例，EagerSingleton操作消耗时间\t--" + consumingTime + "纳秒");

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            LazySingleton instance = LazySingleton.getInstance();
        }
        consumingTime = System.nanoTime() - startTime;
        System.out.println("获取"+num+"个实例，LazySingleton操作消耗时间\t--" + consumingTime + "纳秒");

        startTime = System.nanoTime();
        for (int i = 0; i < num; i++) {
            InnerSingleton instance = InnerSingleton.getInstance();
        }
        consumingTime = System.nanoTime() - startTime;
        System.out.println("获取"+num+"个实例，InnerSingleton操作消耗时间\t--" + consumingTime + "纳秒");


//        获取10000个实例，EagerSingleton操作消耗时间	--552400纳秒
//        获取10000个实例，LazySingleton操作消耗时间	--708100纳秒
//        获取10000个实例，InnerSingleton操作消耗时间	--1036600纳秒

//        获取10000000个实例，EagerSingleton操作消耗时间	--3147400纳秒
//        获取10000000个实例，LazySingleton操作消耗时间	    --170431800纳秒
//        获取10000000个实例，InnerSingleton操作消耗时间	--3233600纳秒

    }

}
