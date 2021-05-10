package com.mvn.designpattern.chapter03.demo01;

/**
 * 4 创建具体工厂
 */
public class ConcreteFactoryHuawei implements AbstractFactory{

    @Override
    public AbstractProductPC createProductPC() {
        System.out.println("华为工厂创建电脑产品");
        return new ConcreteProductPCHuawei();
    }

    @Override
    public AbstractProductPhone createProductPhone() {
        System.out.println("华为工厂创建手机产品");
        return new ConcreteProductPhoneHuawei();
    }

}
