package com.mvn.designpattern.chapter19.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月12日21:12:19
 * @description: 3 负责人  用于保存备忘录对象   回退历史状态
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
    
}
