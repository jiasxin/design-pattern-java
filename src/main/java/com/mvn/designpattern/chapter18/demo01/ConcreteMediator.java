package com.mvn.designpattern.chapter18.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:30:54
 * @description: 3 具体中介者
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void operation() {
        //通过中介者调用同事类的方法
        System.out.println("ConcreteMediator.operation() 调用 具体同事类method1() ");
        colleagues.get(0).method1();
    }

}
