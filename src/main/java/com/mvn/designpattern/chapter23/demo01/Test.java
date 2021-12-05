package com.mvn.designpattern.chapter23.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日22:53:37
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        Account account = new CurrentAccount();
        account.handle("张无忌", "123456");

        account = new SavingAccount();
        account.handle("张无忌", "123456");

    }


}
