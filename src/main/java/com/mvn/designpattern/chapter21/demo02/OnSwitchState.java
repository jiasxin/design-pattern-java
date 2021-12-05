package com.mvn.designpattern.chapter21.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月20日22:59:02
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class OnSwitchState extends SwitchState {

    @Override
    public void on(Switch s) {
        System.out.println(s.getName() + "已经打开！");
    }

    @Override
    public void off(Switch s) {
        System.out.println(s.getName() + "关闭！");
        s.setState(Switch.getState("off"));
    }

}
