package com.mvn.designpattern.chapter07.demo02;

/**
 * 3具体业务类  选择性的覆盖父类（缺省适配器接类）中方法
 * @author: jiasx
 * @date: 2021年6月27日10:47:22
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcreteServiceClass extends AbstractServiceClass{

    @Override
    public void method2() {
        super.method2();
    }

    @Override
    public void method3() {
        super.method3();
    }

}
