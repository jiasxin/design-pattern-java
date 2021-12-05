package com.mvn.designpattern.chapter21.demo03;

/**
 * @author: jiasx
 * @date: 2021年9月20日23:17:32
 * @description: 正常状态类 ： 具体状态类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class NormalState extends ScreenState {

    @Override
    public void display() {
        System.out.println("正常大小");
    }

}
