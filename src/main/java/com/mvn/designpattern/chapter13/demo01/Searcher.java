package com.mvn.designpattern.chapter13.demo01;

/**
 * 2 抽象主题角色   抽象查询类
 */
public interface Searcher {

	/**
	 * 查询接口
	 * @param userId
	 * @param keyword
	 * @return
	 */
	public String doSearch(String userId,String keyword);

}