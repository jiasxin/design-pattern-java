package com.mvn.designpattern.chapter08.demo01;

/**
 * 4 扩充抽象类
 * @author: jiasx
 * @date: 2021年6月27日11:27:56
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class RefinedAbstraction extends Abstraction{

    @Override
    public void operation() {
        implementor.operationImpl();
    }

}
