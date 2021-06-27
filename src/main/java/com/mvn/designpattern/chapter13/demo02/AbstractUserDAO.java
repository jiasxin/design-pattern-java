package com.mvn.designpattern.chapter13.demo02;

/**
 * 1 抽象主题角色
 */
public interface AbstractUserDAO {

	public Boolean findUserById(String userId);

}
