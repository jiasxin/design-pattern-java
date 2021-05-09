package com.mvn.designpattern.chapter02.demo01;

/**
 * 4 创建具体工厂角色
 * 数据库日志记录器工厂
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {

        //连接数据库 代码省略

        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();

        //初始化日志记录器 代码省略

        return logger;

    }

    @Override
    public Logger createLogger(String args) {

        //连接数据库 代码省略

        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();

        //初始化日志记录器 代码省略

        return logger;
    }

}
