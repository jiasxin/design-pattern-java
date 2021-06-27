package com.mvn.designpattern.chapter07.demo03;

/**
 * 4 具体适配者
 * @author: jiasx
 * @date: 2021年6月27日11:00:33
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcreteAdaptee implements Adaptee{

    @Override
    public void specificRequest() {
        System.out.println("特殊请求");
    }

}
