package com.mvn.designpattern.chapter22.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月21日12:01:16
 * @description: 儿童票折扣类  充当具体策略类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ChildrenDiscount implements Discount {

    private String name = "儿童票";

    private final double DISCOUNT = 10;

    @Override
    public double calculate(double price) {
        if (price >= 20) {
            return price - DISCOUNT;
        }
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
