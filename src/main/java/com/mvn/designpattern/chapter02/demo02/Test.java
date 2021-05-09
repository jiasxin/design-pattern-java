package com.mvn.designpattern.chapter02.demo02;

import cn.hutool.setting.dialect.Props;
import com.mvn.designpattern.chapter02.demo01.Logger;
import com.mvn.designpattern.chapter02.demo01.LoggerFactory;

import java.io.IOException;

/**
 * 创建测试类
 *
 * 不修改任何客户端代码实现更换或增加新的日志记录方式 （利用java反射实现，符合开闭原则）
 *
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        LoggerFactory factory = null;
        Logger logger = null;

        //实例化文件日志记录器
        Props props = new Props("config.properties");
        String logClassPath = props.getStr("log.class.path");
        Class objClass = Class.forName(logClassPath);

        //通过Java反射机制生成实例对象
        factory = (LoggerFactory)objClass.newInstance();
        logger = factory.createLogger();
        logger.writeLog();

    }

}
