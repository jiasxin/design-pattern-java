package com.mvn.designpattern.chapter16.demo01;

/**
 * 非终结符表达式角色   And结点类
 */
public class AndNode extends AbstractNode {

	/**
	 * And的左表达式
	 */
	private AbstractNode left;

	/**
	 * And右表达式
	 */
	private AbstractNode right;

	public AndNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * And表达式解释操作
	 * @return
	 */
	public String interpret() {
		return left.interpret() + "再" + right.interpret();
	}

}
