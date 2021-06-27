package com.mvn.designpattern.chapter13.demo02;

/**
 * 2 具体主题角色
 */
public class UserDAO implements AbstractUserDAO {

    public Boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("张无忌")) {
            System.out.println("查询ID为" + userId + "的用户成功");
            return true;
        } else {
            System.out.println("查询ID为" + userId + "的用户失败");
            return false;
        }
    }

}
