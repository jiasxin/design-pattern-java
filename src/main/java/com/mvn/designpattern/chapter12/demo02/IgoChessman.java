package com.mvn.designpattern.chapter12.demo02;

/**
 * 1 抽象享元类     围棋棋子类
 */
public abstract class IgoChessman {

    public abstract String getColor();

    public void display(Coordinates coord) {
        System.out.println("棋子颜色：" + this.getColor() + ",棋子位置x:" + coord.getX() + ",y:" + coord.getY());
    }

}

