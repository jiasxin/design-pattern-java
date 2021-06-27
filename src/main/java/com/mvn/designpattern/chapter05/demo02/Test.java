package com.mvn.designpattern.chapter05.demo02;

/**
 * @author: jiasx
 * @date: 2021年6月27日7:32:25
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        ConcretePrototype obj = new ConcretePrototype();
        obj.setAttr("aaa");
        System.out.println(obj);

        ConcretePrototype clone = obj.clone();
        System.out.println(clone);

    }

}
