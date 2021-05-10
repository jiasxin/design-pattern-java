package com.mvn.designpattern.chapter03.demo01;

/**
 * 3 创建抽象工厂
 */
public interface AbstractFactory {

    public AbstractProductPC createProductPC();

    public AbstractProductPhone createProductPhone();

}
