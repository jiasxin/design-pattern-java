package com.mvn.designpattern.chapter20.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月13日18:33:06
 * @description: 1 抽象观察者类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public interface Observer {

    public String getName();

    public void setName(String name);

    public void help(); //声明支援盟友方法

    public void beAttacked(AllyControlCenter acc); //声明遭受攻击方法

}
