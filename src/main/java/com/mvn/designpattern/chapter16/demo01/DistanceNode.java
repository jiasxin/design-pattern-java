package com.mvn.designpattern.chapter16.demo01;

/**
 * 充当终结符表达式角色    距离结点类
 */
public class DistanceNode extends AbstractNode {

	private String distance;
	
	public DistanceNode(String distance) {
		this.distance = distance;
	}

	/**
	 * 距离表达式的解释操作
	 * @return
	 */
	public String interpret() {
		return this.distance;
	}

}