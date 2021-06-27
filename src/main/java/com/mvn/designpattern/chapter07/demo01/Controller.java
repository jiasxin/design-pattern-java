package com.mvn.designpattern.chapter07.demo01;

/**
 * 1 目标抽象类 车辆控制器
 * @author: jiasx
 * @date: 2021年6月27日10:03:55
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class Controller {

    /**
     * 移动
     */
    public void move(){
        System.out.println("玩具移动");
    }

    /**
     * 发出声音
     */
    public abstract void phonate();

    /**
     * 发出闪烁
     */
    public abstract void twinkle();

}
