package com.mvn.designpattern.chapter20.demo01;

import java.util.ArrayList;

/**
 * @author: jiasx
 * @date: 2021年9月13日18:34:14
 * @description: 2 目标类  战队控制中心
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class AllyControlCenter {

    /**
     * 定义一个集合用于存储战队成员
     */
    protected ArrayList<Observer> players = new ArrayList<Observer>();

    /**
     * 战队名称
     */
    protected String allyName;

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    /**
     * 注册方法
     *
     * @param obs
     */
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    /**
     * 注销方法
     *
     * @param obs
     */
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    /**
     * 声明抽象通知方法
     *
     * @param name
     */
    public abstract void notifyObserver(String name);

}
