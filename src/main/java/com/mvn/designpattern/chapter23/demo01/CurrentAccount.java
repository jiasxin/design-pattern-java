package com.mvn.designpattern.chapter23.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日22:51:13
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class CurrentAccount extends Account{

    @Override
    public void calculateInterest() {
        //覆盖父类的抽象基本方法
        System.out.println("按活期利率计算利息");
    }

}
