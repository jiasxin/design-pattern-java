package com.mvn.designpattern.chapter03.demo01;

/**
 * 2 创建具体产品
 */
public class ConcreteProductPhoneXiaomi implements AbstractProductPhone{

    @Override
    public void printProductName() {
        System.out.println("手机产品-小米");
    }

}
