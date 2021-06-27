package com.mvn.designpattern.chapter08.demo01;

/**
 * 3 抽象类
 * @author: jiasx
 * @date: 2021年6月27日11:25:14
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class Abstraction {

    /**
     * 定义实现类接口对象
     */
    protected Implementor implementor ;

    public void setImpl(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 声明抽象业务方法
     */
    public abstract void operation();

}
