package com.mvn.designpattern.chapter15.demo01;

/**
 * 充当具体命令类   退出命令类
 */
public class ExitCommand extends Command {

    private SystemExitClass seObj;  //维持对请求接收者的引用

    public ExitCommand() {
        seObj = new SystemExitClass();
    }

    //命令执行方法，将调用请求接受者的业务方法
    public void execute() {
        seObj.exit();
    }

}