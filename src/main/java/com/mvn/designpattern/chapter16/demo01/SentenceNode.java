package com.mvn.designpattern.chapter16.demo01;

/**
 * 非终结符表达式角色   简单句子的结点类
 */
public class SentenceNode extends AbstractNode {

    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    /**
     * 简单句子的解释操作
     * @return
     */
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }

}