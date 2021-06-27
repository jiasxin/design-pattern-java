package com.mvn.designpattern.chapter07.demo03;

/**
 * @author: jiasx
 * @date: 2021年6月27日11:01:38
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    /**
     * 适配器模式在于将现有接口转化为客户类所期望的接口，实现对现有类的复用
     * @param args
     */
    public static void main(String[] args) {

        Adapter adapter = null;
        Target target = null;

        adapter = new Adapter(new ConcreteAdaptee());
        adapter.request();

        adapter = new Adapter(new ConcreteTarget());
        adapter.specificRequest();

    }

}
