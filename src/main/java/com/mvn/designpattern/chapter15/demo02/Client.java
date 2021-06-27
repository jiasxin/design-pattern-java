package com.mvn.designpattern.chapter15.demo02;

public class Client {

    public static void main(String args[]) {

        CalculatorForm form = null;
        AbstractCommand command = null;

        command = new AddCommand();
        form = new CalculatorForm();
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();

    }

}
