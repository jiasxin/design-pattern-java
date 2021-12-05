package com.mvn.designpattern.chapter21.demo03;

/**
 * @author: jiasx
 * @date: 2021年9月20日23:18:52
 * @description: 4倍状态类 ： 具体状态类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class LargestState extends ScreenState {

    @Override
    public void display() {
        System.out.println("4倍大小");
    }

}
