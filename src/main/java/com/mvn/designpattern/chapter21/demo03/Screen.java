package com.mvn.designpattern.chapter21.demo03;

/**
 * @author: jiasx
 * @date: 2021年9月20日23:14:18
 * @description: 屏幕类 ： 环境类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Screen {

    //枚举所有的状态 currentState 表示当前状态
    private ScreenState currentState, normalState, largerState, largestState;

    public Screen() {
        this.normalState = new NormalState();//创建正常状态对象
        this.largerState = new LargerState();//创建正常状态对象
        this.largestState = new LargestState();//创建正常状态对象
        this.currentState = normalState;
        this.currentState.display();
    }

    public void setState(ScreenState state) {
        this.currentState = state;
    }

    public ScreenState getState() {
        return currentState;
    }

    /**
     * 单机事件处理方法，封装了对状态类中业务方法的调用和状态的转换
     */
    public void onClick() {
        if (this.currentState == normalState) {
            this.setState(largerState);
            this.currentState.display();
        } else if (this.currentState == largerState) {
            this.setState(largestState);
            this.currentState.display();
        } else if (this.currentState == largestState) {
            this.setState(normalState);
            this.currentState.display();
        }
    }

}
