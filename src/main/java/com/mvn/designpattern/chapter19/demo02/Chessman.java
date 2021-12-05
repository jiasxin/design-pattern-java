package com.mvn.designpattern.chapter19.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月12日21:23:16
 * @description: 1 棋子类  提供一个用于保存状态、恢复状态的的方法
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Chessman {

    private String label;
    private int x;
    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * 保存状态    创建棋子备忘录
     *
     * @return
     */
    public ChessmanMemento save() {
        return new ChessmanMemento(this.label, this.x, this.y);
    }

    /**
     * 恢复状态  从备忘录对象中取出属性设置到当前对象
     *
     * @return
     */
    public void restore(ChessmanMemento chessmanMemento) {
        this.label = chessmanMemento.getLabel();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
