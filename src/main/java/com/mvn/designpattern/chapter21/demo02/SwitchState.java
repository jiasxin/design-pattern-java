package com.mvn.designpattern.chapter21.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月20日22:44:06
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class SwitchState {

    /**
     * 打开开关
     */
    public abstract void on(Switch s);

    /**
     * 关闭开关
     */
    public abstract void off(Switch s);

}
