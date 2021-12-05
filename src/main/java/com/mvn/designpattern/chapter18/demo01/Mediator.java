package com.mvn.designpattern.chapter18.demo01;

import java.util.ArrayList;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:20:43
 * @description: 1 抽象中介者
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class Mediator {

    /**
     * 用于存储同时对象
     */
    protected ArrayList<Colleague> colleagues = new ArrayList<>();

    /**
     * 注册方法，用于增加同事对象
     *
     * @param colleague
     */
    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    /**
     * 声明抽象的业务方法
     */
    public abstract void operation();

}
