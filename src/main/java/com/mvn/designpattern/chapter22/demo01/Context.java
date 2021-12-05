package com.mvn.designpattern.chapter22.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日11:31:51
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Context {

    private AbstractStrategy strategy;//维持一个对抽象对象策略类的引用

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 调用策略类中的算法
     */
    public void algorithm() {
        strategy.algorithm();
    }

}
