package com.mvn.designpattern.chapter02.demo01;

/**
 * 2 创建具体产品角色
 *
 * 数据库日志记录器
 */
public class DatabaseLogger implements Logger{

    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }

}
