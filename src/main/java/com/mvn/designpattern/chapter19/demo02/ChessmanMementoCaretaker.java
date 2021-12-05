package com.mvn.designpattern.chapter19.demo02;

import java.util.Stack;

/**
 * @author: jiasx
 * @date: 2021年9月12日21:32:02
 * @description: 3  棋子备忘录管理类  充当负责人
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ChessmanMementoCaretaker {

    /**
     * 棋子移动操作历史记录栈
     */
    private Stack<ChessmanMemento> operStack = new Stack<>();

    /**
     * 棋子撤销操作历史记录栈
     */
    private Stack<ChessmanMemento> undoStack = new Stack<>();

    public Stack<ChessmanMemento> getOperStack() {
        return operStack;
    }

    public Stack<ChessmanMemento> getUndoStack() {
        return undoStack;
    }

}
