package com.mvn.designpattern.chapter19.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月12日21:26:28
 * @description: 2  棋子备忘录类充当备忘录
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ChessmanMemento {

    private String label;
    private int x;
    private int y;

    public ChessmanMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
