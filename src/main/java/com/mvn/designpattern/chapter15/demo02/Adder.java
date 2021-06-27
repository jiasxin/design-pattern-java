package com.mvn.designpattern.chapter15.demo02;

/**
 * 请求接受者   添加处理处理类
 */
public class Adder {

    private int num = 0;

    public int add(int value) {
        num += value;
        return num;
    }

}