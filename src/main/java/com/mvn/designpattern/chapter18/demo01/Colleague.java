package com.mvn.designpattern.chapter18.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:23:10
 * @description: 2 抽象同事类   维持抽象中介者的引用
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class Colleague {

    /**
     * 维持一个抽象中介者的引用
     */
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 声明自己的方法，处理自己的行为
     */
    public abstract void method1();

    /**
     * 定义依赖方法，与中介者进行通信
     */
    public void method2() {
        mediator.operation();
    }

}
