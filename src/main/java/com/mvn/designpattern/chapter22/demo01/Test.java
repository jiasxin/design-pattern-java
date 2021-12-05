package com.mvn.designpattern.chapter22.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月21日11:27:16
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        Context context = new Context();
        AbstractStrategy strategy = new ConcreteStrategyA();//可在运行时指定类型，通过配置文件和反射机制实现
        context.setStrategy(strategy);
        context.algorithm();

    }

}
