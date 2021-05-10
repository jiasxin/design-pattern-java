package com.mvn.designpattern.chapter03.demo02;

/**
 * 2 创建具体产品
 *
 * Windows主题按钮
 */
public class WindowsButton implements Button{
    @Override
    public void display() {
        System.out.println("Windows主题按钮");
    }
}
