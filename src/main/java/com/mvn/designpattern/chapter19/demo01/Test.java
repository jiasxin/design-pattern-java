package com.mvn.designpattern.chapter19.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月12日21:14:30
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        //创建原发器对象
        Originator originator = new Originator("状态1");
        System.out.println(originator.getState());

        //创建负责人对象，保存创建的备忘录对象
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        //变更原发器状态
        originator.setState("状态2");
        System.out.println(originator.getState());

        //从负责人对象中取出备忘录对象，实现撤销
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());

    }

}


