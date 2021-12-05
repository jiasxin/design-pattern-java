package com.mvn.designpattern.chapter19.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月12日21:08:20
 * @description: 2 备忘录类  默认可见性  包内可见
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
class Memento {

    private String state;

    /**
     * 备忘录构造器，除了原发器不允许其他类调用
     * @param originator
     */
    public Memento(Originator originator) {
        state = originator.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
