package com.mvn.designpattern.chapter15.demo03;

import java.util.ArrayList;

/**
 * 命令队列实现类
 * @author: jiasx
 * @date: 2021年6月27日18:53:13
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class CommandQueue {

    private ArrayList<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void removeCommand(Command command) {
        commandList.remove(command);
    }

    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }

}
