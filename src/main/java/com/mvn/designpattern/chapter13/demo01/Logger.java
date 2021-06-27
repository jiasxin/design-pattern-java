package com.mvn.designpattern.chapter13.demo01;

/**
 * 1 业务类  日志记录类
 */
public class Logger {

    //提供log方法来保存日志
    public void log(String userId) {
        System.out.println("更新数据库用户" + userId + "查询次数+1");
    }

}