package com.mvn.designpattern.chapter24.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日23:50:06
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        ElementList elementList = new ElementList();

        Visitor elementA = new ConcreteElementA();
        Visitor elementB = new ConcreteElementB();
        Visitor elementC = new ConcreteElementC();

        elementList.addElement((Element) elementA);
        elementList.addElement((Element) elementB);
        elementList.addElement((Element) elementC);

//        elementList.accept(elementA);
//        elementList.accept(elementB);
        elementList.accept(elementC);

    }

}
