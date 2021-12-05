package com.mvn.designpattern.chapter24.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日23:39:12
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcreteElementC extends Visitor implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("ConcreteElementC--A--");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("ConcreteElementC--B--");
    }

}
