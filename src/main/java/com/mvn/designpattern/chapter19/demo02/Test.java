package com.mvn.designpattern.chapter19.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月12日21:33:03
 * @description: 测试类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    //悔棋与撤销悔棋操作只维持单条链路，若悔棋后走棋，则不支持撤销悔棋
    //移动1 》 移动2 》 移动3  》 悔棋 》 移动2 》 撤销悔棋 》 移动3 》 移动4 》 悔棋 》 移动3 》 撤销悔棋 》 移动3

    //初始化棋子备忘录管理类
    private static ChessmanMementoCaretaker caretaker = new ChessmanMementoCaretaker();

    public static void main(String[] args) {

        //棋子走动
        Chessman chessman = new Chessman("车", 1, 1);

        move(chessman, 1, 2);
        move(chessman, 1, 3);
        move(chessman, 1, 4);
        move(chessman, 1, 5);

        undo(chessman);
        undo(chessman);
        undo(chessman);
        undo(chessman);
        undo(chessman);
        undo(chessman);
        reundo(chessman);

        undo(chessman);
        undo(chessman);
        reundo(chessman);
        reundo(chessman);

        undo(chessman);
        undo(chessman);
        reundo(chessman);

        undo(chessman);
        reundo(chessman);
        reundo(chessman);

        move(chessman, 1, 6);
        reundo(chessman);

        undo(chessman);
        undo(chessman);

        reundo(chessman);
        reundo(chessman);
        reundo(chessman);

    }

    /**
     * 显示棋子
     *
     * @param chessman
     */
    private static void display(Chessman chessman) {
        System.out.println("棋子：" + chessman.getLabel() + " 当前位置 ： x=" + chessman.getX() + ",y=" + chessman.getY());
    }

    /**
     * 移动棋子
     *
     * @param chessman
     * @param x
     * @param y
     */
    private static void move(Chessman chessman, int x, int y) {
        System.out.println("-----移动------");
        chessman.setX(x);
        chessman.setY(y);
        caretaker.getOperStack().push(chessman.save());
        caretaker.getUndoStack().clear();
        display(chessman);
    }

    /**
     * 悔棋
     *
     * @param chessman
     */
    private static void undo(Chessman chessman) {
        if (caretaker.getOperStack().size() > 0) {
            ChessmanMemento chessmanMemento = caretaker.getOperStack().pop();
            if (chessmanMemento != null) {
                caretaker.getUndoStack().push(chessmanMemento);
                if (chessmanMemento.getLabel().equals(chessman.getLabel()) && chessmanMemento.getX() == chessman.getX() && chessmanMemento.getY() == chessman.getY()) {
                    if (caretaker.getOperStack().size() > 0) {
                        chessmanMemento = caretaker.getOperStack().pop();
                        if (chessmanMemento != null) {
                            caretaker.getUndoStack().push(chessmanMemento);
                        }
                    }
                }
            }
            if (chessmanMemento != null) {
                System.out.println("-----悔棋------");
                chessman.restore(chessmanMemento);
                display(chessman);
            }
        }
    }

    /**
     * 撤销悔棋
     *
     * @param chessman
     */
    private static void reundo(Chessman chessman) {
        if (caretaker.getUndoStack().size() > 0) {
            ChessmanMemento chessmanMemento = caretaker.getUndoStack().pop();
            if (chessmanMemento != null) {
                caretaker.getOperStack().push(chessmanMemento);
                if (chessmanMemento.getLabel().equals(chessman.getLabel()) && chessmanMemento.getX() == chessman.getX() && chessmanMemento.getY() == chessman.getY()) {
                    if (caretaker.getUndoStack().size() > 0) {
                        chessmanMemento = caretaker.getUndoStack().pop();
                        if (chessmanMemento != null) {
                            caretaker.getOperStack().push(chessmanMemento);
                        }
                    }
                }
                if (chessmanMemento != null) {
                    System.out.println("-----撤销悔棋------");
                    chessman.restore(chessmanMemento);
                    display(chessman);
                }
            }
        }
    }


}
