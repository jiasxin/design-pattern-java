package com.mvn.designpattern.chapter07.demo03;

/**
 *
 * 5 双向适配器   适配器中同时包含对目标类和适配者类的应用
 * @author: jiasx
 * @date: 2021年6月27日10:51:53
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Adapter implements Target, Adaptee {

    private Target target;

    private Adaptee adaptee;

    public Adapter(Target target) {
        this.target = target;
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
