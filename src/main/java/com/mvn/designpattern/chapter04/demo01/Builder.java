package com.mvn.designpattern.chapter04.demo01;

/**
 * 2 抽象建造者
 * @author: jiasx
 * @date: 2021年6月26日22:40:54
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getProduct(){
        return product;
    }

}
