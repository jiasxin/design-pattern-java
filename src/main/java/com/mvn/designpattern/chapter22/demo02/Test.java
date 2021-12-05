package com.mvn.designpattern.chapter22.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月21日12:05:24
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        double orignalPrice = 60.0;
        System.out.println("原始价为：" + orignalPrice);

        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setPrice(orignalPrice);

        movieTicket.setDiscount(new ChildrenDiscount());
        System.out.println("当前票价为：" + movieTicket.getPrice() + ",折扣类型：" + movieTicket.getDiscount().getName());

        movieTicket.setDiscount(new StudentDiscount());
        System.out.println("当前票价为：" + movieTicket.getPrice() + ",折扣类型：" + movieTicket.getDiscount().getName());

        movieTicket.setDiscount(new VIPDiscount());
        System.out.println("当前票价为：" + movieTicket.getPrice() + ",折扣类型：" + movieTicket.getDiscount().getName());

    }

}
