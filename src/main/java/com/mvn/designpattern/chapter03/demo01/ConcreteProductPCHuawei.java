package com.mvn.designpattern.chapter03.demo01;

/**
 * 2 创建具体产品
 */
public class ConcreteProductPCHuawei implements AbstractProductPC{
    @Override
    public void printProductName() {
        System.out.println("电脑产品-华为");
    }
}
