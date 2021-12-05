package com.mvn.designpattern.chapter22.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月21日11:53:14
 * @description: 1 点影票类   充当环境类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class MovieTicket {

    private double price;

    private Discount discount;//维持一个对抽象折扣类的引用

    public double getPrice() {
        return this.discount.calculate(this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

}
