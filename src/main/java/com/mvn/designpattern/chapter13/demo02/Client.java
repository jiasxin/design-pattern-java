package com.mvn.designpattern.chapter13.demo02;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

/**
 * 动态代理模式测试
 */
public class Client {

    public static void main(String args[]) {

        AbstractUserDAO userDAO = new UserDAO();
        AbstractUserDAO proxy = null;
        InvocationHandler handler = null;

        handler = new DAOLogHandler(userDAO);

        //动态创建代理对象、用于代理一个类型为AbstractUserDAO的真实主题对象
        proxy = (AbstractUserDAO) Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[]{AbstractUserDAO.class}, handler);
        proxy.findUserById("张无忌"); //调用代理对象的业务方法

        System.out.println("------------------------------");

        AbstractDocumentDAO docDAO = new DocumentDAO();
        handler = new DAOLogHandler(docDAO);
        AbstractDocumentDAO proxy_new = null;

        //动态创建代理对象、用于代理一个类型为AbstractDocumentDAO的真实主题对象
        proxy_new = (AbstractDocumentDAO) Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[]{AbstractDocumentDAO.class}, handler);
        proxy_new.deleteDocumentById("D002"); //调用代理对象的业务方法


    }
}
