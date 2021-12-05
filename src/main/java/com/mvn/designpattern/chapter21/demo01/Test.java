package com.mvn.designpattern.chapter21.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月16日9:56:03
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        Account acc = new Account("段誉", 0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();

    }

}
