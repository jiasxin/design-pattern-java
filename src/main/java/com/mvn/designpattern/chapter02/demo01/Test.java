package com.mvn.designpattern.chapter02.demo01;

/**
 * 创建测试类
 */
public class Test {

    public static void main(String[] args) {

        LoggerFactory factory = null;
        Logger logger = null;

        //实例化文件日志记录器
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();

        //实例化数据库日志记录器
        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();

    }

}
