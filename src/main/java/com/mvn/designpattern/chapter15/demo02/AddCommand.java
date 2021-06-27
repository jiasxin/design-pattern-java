package com.mvn.designpattern.chapter15.demo02;

/**
 * 充当具体命令类   添加命令类
 */
public class AddCommand extends AbstractCommand {

    private Adder adder = new Adder();

    private int value;

    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    public int undo() {
        return adder.add(-value);
    }

}