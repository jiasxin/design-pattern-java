package com.mvn.designpattern.chapter15.demo03;

/**
 * 充当具体命令类   帮助命令类
 */
public class HelpCommand extends Command {

    private DisplayHelpClass hcObj;   //维持对请求接受者的引用

    public HelpCommand() {
        hcObj = new DisplayHelpClass();
    }

    //命令执行方法，将调用请求接受者的业务方法
    public void execute() {
        hcObj.display();
    }

}
