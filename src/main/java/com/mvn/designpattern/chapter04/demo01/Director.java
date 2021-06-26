package com.mvn.designpattern.chapter04.demo01;

/**
 * 4 建造指挥者
 *
 * @author: jiasx
 * @date: 2021年6月26日22:46:40
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }

}
