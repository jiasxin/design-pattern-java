package com.mvn.designpattern.chapter21.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月20日23:03:13
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class OffSwitchState extends SwitchState {

    @Override
    public void on(Switch s) {
        System.out.println(s.getName() + "打开");
    }

    @Override
    public void off(Switch s) {
        System.out.println(s.getName() + "已经关闭");
        s.setState(Switch.getState("on"));
    }

}
