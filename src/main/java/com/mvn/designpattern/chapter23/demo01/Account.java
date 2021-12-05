package com.mvn.designpattern.chapter23.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日14:18:05
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class Account {

    /**
     * 具体方法
     *
     * @param account
     * @param password
     * @return
     */
    public boolean validate(String account, String password) {
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        if (account.equalsIgnoreCase("张无忌") && password.equalsIgnoreCase("123456")) {
            return true;
        }
        return false;
    }

    /**
     * 基本抽象方法
     */
    public abstract void calculateInterest();

    /**
     * 具体方法
     */
    public void display() {
        System.out.println("显示利息");
    }

    /**
     * 模板方法
     */
    public void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账号或密码错误");
            return;
        }
        calculateInterest();
        display();
    }

}