package com.mvn.designpattern.chapter18.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:34:12
 * @description: 4 具体同事类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void method1() {
        //实现自身方法
        System.out.println("ConcreteColleague.method1() 执行 ");
    }

}
