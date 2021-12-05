package com.mvn.designpattern.chapter21.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月15日22:21:05
 * @description: 2 具体状态类   透支状态
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class OverdraftState extends AccountState {

    public OverdraftState(AccountState state) {
        this.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        } else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
        } else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }

}
