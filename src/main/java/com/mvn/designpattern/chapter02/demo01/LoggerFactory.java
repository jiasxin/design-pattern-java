package com.mvn.designpattern.chapter02.demo01;

/**
 * 3 创建抽象工厂角色
 *
 * 日志记录器工厂接口
 */
public interface LoggerFactory {

    public Logger createLogger();

    public Logger createLogger(String args);

}
