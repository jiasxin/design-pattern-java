package com.mvn.designpattern.chapter18.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:53:09
 * @description: 6 盒子组件类  充当具体同事类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class BoxComponent extends Component {

    @Override
    public void update() {
        System.out.println("盒子框增加一项：张无忌");
    }

    public void select() {
        System.out.println("盒子框增加一项：小龙女");
    }

}
