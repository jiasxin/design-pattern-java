package com.mvn.designpattern.chapter18.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:36:26
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();
        Colleague colleague = new ConcreteColleague(mediator);
        mediator.register(colleague);

        mediator.operation();

    }

}
