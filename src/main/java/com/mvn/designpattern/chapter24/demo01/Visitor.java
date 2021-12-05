package com.mvn.designpattern.chapter24.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日23:36:50
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class Visitor {

    public abstract void visit(ConcreteElementA elementA);
    public abstract void visit(ConcreteElementB elementB);
    public void visit(ConcreteElementC elementC){
        //元素ConcreteElementC操作代码
        System.out.println("元素ConcreteElementC");
    }

}
