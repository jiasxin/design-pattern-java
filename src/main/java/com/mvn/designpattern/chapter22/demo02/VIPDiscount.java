package com.mvn.designpattern.chapter22.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月21日12:03:39
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class VIPDiscount implements Discount {

    private String name = "VIP票";

    private final double DISCOUNT = 0.5;

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
