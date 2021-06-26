package com.mvn.designpattern.chapter04.demo01;

/**
 * 3 具体建造者
 * @author: jiasx
 * @date: 2021年6月26日22:44:09
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcreteBuilder1 extends Builder{

    @Override
    public void buildPartA() {
        product.setPartA("A1");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B1");
    }

    @Override
    public void buildPartC() {
        product.setPartC("C1");
    }

}
