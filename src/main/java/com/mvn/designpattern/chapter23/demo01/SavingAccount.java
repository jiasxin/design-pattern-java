package com.mvn.designpattern.chapter23.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日22:52:38
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class SavingAccount extends Account{

    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息");
    }

}
