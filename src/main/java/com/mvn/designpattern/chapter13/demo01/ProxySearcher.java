package com.mvn.designpattern.chapter13.demo01;

/**
 * 4 代理主题角色    代理查询类
 */
public class ProxySearcher implements Searcher {

    private RealSearcher searcher = new RealSearcher(); //维持一个对真实主题的引用
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        //如果身份验证成功，则执行查询
        if (this.validate(userId)) {
            String result = searcher.doSearch(userId, keyword); //调用真实的主题对象的查询方法
            this.log(userId); //记录查询的日志
            return result; //返回查询结果
        } else {
            return null;
        }
    }

    //创建访问验证对象并调用其validate方法实现身份验证
    public boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    //创建日志记录对象实现登录日志记录
    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }

}
