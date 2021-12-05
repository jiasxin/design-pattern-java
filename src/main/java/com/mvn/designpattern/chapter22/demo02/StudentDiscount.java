package com.mvn.designpattern.chapter22.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月21日11:57:29
 * @description: 学生票折扣类  充当具体策略类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class StudentDiscount implements Discount {

    private String name = "学生票";

    private final double DISCOUNT = 0.8;

    @Override
    public double calculate(double price) {
        return price * DISCOUNT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
