package com.mvn.designpattern.chapter24.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日23:39:49
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public interface Element {

    public void accept(Visitor visitor);

}
