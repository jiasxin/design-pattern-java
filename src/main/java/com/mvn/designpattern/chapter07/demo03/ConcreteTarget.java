package com.mvn.designpattern.chapter07.demo03;

/**
 * 2 具体目标类
 * @author: jiasx
 * @date: 2021年6月27日11:00:21
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcreteTarget implements Target{

    @Override
    public void request() {
        System.out.println("一般请求");
    }

}
