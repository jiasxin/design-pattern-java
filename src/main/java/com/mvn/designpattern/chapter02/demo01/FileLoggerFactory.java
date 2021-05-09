package com.mvn.designpattern.chapter02.demo01;

/**
 * 3 创建具体工厂角色
 * 文件日志记录器工厂
 */
public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {

        //创建文件日志记录器对象
        Logger logger = new FileLogger();

        //初始化日志记录器 代码省略

        return logger;

    }

    @Override
    public Logger createLogger(String args) {

        //创建文件日志记录器对象
        Logger logger = new FileLogger();

        //初始化日志记录器 代码省略

        return logger;

    }

}
