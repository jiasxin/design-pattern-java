package com.mvn.designpattern.chapter10.demo01;

/**
 * 4 具体装饰类  黑色边框装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框");
    }

}