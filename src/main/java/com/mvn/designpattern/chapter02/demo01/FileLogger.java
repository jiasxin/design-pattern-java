package com.mvn.designpattern.chapter02.demo01;

/**
 * 2 创建具体产品角色
 *
 * 文件日志记录器
 */
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }

}
