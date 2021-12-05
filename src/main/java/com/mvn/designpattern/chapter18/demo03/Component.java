package com.mvn.designpattern.chapter18.demo03;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:44:40
 * @description: 3 抽象组件类  充当抽象同事类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class Component {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();

}
