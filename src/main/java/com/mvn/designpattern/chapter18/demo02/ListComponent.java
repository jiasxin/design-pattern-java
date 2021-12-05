package com.mvn.designpattern.chapter18.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:51:26
 * @description: 5 列表组件类  充当具体同事类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ListComponent extends Component {

    @Override
    public void update() {
        System.out.println("列表框增加一项：张无忌");
    }

    public void select() {
        System.out.println("列表框增加一项：小龙女");
    }

}