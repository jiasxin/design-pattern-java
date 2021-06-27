package com.mvn.designpattern.chapter13.demo01;

/**
 * 1 业务类  身份验证类
 */
public class AccessValidator {

    //模拟实现登录验证
    public boolean validate(String userId) {
        System.out.println("在数据库验证用户" + userId + "是否是合法用户");
        if (userId.equalsIgnoreCase("杨过")) {
            System.out.println("用户" + userId + "登录成功");
            return true;
        } else {
            System.out.println("用户" + userId + "登录失败");
            return false;
        }
    }

}
