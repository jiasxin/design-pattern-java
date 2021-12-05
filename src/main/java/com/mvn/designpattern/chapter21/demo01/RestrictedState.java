package com.mvn.designpattern.chapter21.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月15日22:22:19
 * @description: 2 具体状态类    受限状态
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class RestrictedState extends AccountState {

    public RestrictedState(AccountState state) {
        this.account = state.account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("帐号受限，取款失败");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        } else if (account.getBalance() > -2000) {
            account.setState(new OverdraftState(this));
        }
    }

}
