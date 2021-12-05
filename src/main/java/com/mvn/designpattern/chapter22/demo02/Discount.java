package com.mvn.designpattern.chapter22.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月21日11:54:12
 * @description: 折扣类  充当抽象策略类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public interface Discount {

    public double calculate(double price);

    public String getName();

}
