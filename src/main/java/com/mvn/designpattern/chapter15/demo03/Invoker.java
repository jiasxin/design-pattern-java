package com.mvn.designpattern.chapter15.demo03;

/**
 * 请求发送者
 * @author: jiasx
 * @date: 2021年6月27日18:56:40
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Invoker {

    private CommandQueue commandQueue;

    public CommandQueue getCommandQueue() {
        return commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void call(){
        commandQueue.execute();
    }

}
