package com.mvn.designpattern.chapter10.demo01;

/**
 * 测试装饰者模式
 */
public class Client {

    public static void main(String args[]) {

        Component component, componentSB, componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();

    }

}