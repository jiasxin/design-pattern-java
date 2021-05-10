package com.mvn.designpattern.chapter03.demo02;

/**
 * 2 创建具体产品
 */
public class MacButton implements Button{
    @Override
    public void display() {
        System.out.println("Mac主题按钮");
    }
}
