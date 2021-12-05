package com.mvn.designpattern.chapter24.demo02;

/**
 * 1 部门类 充当抽象访问者类
 * @author: jiasx
 * @date: 2021年9月22日0:07:40
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class Department {

    /**
     * 声明一组重载的抽象方法，用于访问不同类型的具体元素
     * @param fullTimeEmployee
     */
    public abstract void visit(FullTimeEmployee fullTimeEmployee);

    /**
     * 声明一组重载的抽象方法，用于访问不同类型的具体元素
     * @param partTimeEmployee
     */
    public abstract void visit(PartTimeEmployee partTimeEmployee);

}
