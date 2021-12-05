package com.mvn.designpattern.chapter19.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月12日21:05:05
 * @description: 1 原发器   一般将系统中需要保存的内部状态的类设计为原发器
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    /**
     * 创建一个备忘录对象
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(this);
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void restoreMemento(Memento memento) {
        state = memento.getState();
    }

}
