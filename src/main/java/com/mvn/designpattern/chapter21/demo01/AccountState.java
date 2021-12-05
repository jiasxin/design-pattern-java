package com.mvn.designpattern.chapter21.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月15日22:17:31
 * @description: 1 抽象状态类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class AccountState {

    /**
     * 维持账户引用
     */
    protected Account account;

    /**
     * 存款
     *
     * @param amount
     */
    public abstract void deposit(double amount);

    /**
     * 取款
     *
     * @param amount
     */
    public abstract void withdraw(double amount);

    /**
     * 计算利息
     */
    public abstract void computeInterest();

    /**
     * 状态检查
     */
    public abstract void stateCheck();

}