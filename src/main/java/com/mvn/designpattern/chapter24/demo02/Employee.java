package com.mvn.designpattern.chapter24.demo02;

/**
 * 1 员工类 充当抽象元素类
 * @author: jiasx
 * @date: 2021年9月21日23:59:44
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public interface Employee {

    /**
     * 接收一个抽象访问者访问
     * @param department
     */
    public void accept(Department department);

}
