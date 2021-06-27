package com.mvn.designpattern.chapter13.demo01;

/**
 * 3 具体主题角色    具体查询类
 */
public class RealSearcher implements Searcher {

    //模拟查询商务信息
    public String doSearch(String userId, String keyword) {
        System.out.println("用户" + userId + "使用关键词" + keyword + "查询商务信息");
        return "返回具体内容";
    }

}
