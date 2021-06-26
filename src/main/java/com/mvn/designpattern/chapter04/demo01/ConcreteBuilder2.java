package com.mvn.designpattern.chapter04.demo01;

/**
 * 3 具体建造者
 * @author: jiasx
 * @date: 2021年6月26日22:45:55
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcreteBuilder2 extends Builder{

    @Override
    public void buildPartA() {
        product.setPartA("A2");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B2");
    }

    @Override
    public void buildPartC() {
        product.setPartC("C2");
    }

}