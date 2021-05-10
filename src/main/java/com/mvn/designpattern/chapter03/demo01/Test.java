package com.mvn.designpattern.chapter03.demo01;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {

        AbstractFactory factory = null;

        factory = new ConcreteFactoryHuawei();
        factory.createProductPC().printProductName();
        factory.createProductPhone().printProductName();

        factory = new ConcreteFactoryXiaomi();
        factory.createProductPC().printProductName();
        factory.createProductPhone().printProductName();

    }

}
