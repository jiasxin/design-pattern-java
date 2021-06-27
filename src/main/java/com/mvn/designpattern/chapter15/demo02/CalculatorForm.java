package com.mvn.designpattern.chapter15.demo02;

/**
 * 请求发生者
 */
public class CalculatorForm {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value) {
        int i = command.execute(value);
        System.out.println("执行计算，计算结果" + i);
    }

    public void undo() {
        int i = command.undo();
        System.out.println("执行撤销，计算结果：" + i);
    }

}
