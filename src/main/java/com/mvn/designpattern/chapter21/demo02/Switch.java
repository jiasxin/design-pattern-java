package com.mvn.designpattern.chapter21.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月20日22:42:44
 * @description: 共享状态示例
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Switch {

    private static SwitchState currentState, onState, offState; //定义三个静态的状态对象

    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnSwitchState();
        offState = new OffSwitchState();
        currentState = onState;
    }

    public static SwitchState getState(String type) {
        if ("on".equalsIgnoreCase(type)) {
            return onState;
        }
        return offState;
    }

    public static void setState(SwitchState state) {
        currentState = state;
    }

    public void on() {
        currentState.on(this);
    }

    public void off() {
        currentState.off(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
