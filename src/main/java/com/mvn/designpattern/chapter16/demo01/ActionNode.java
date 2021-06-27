package com.mvn.designpattern.chapter16.demo01;

/**
 * 充当终结符表达式角色    动作结点类
 */
public class ActionNode extends AbstractNode {

    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    //移动方式的表达式解释操作
    public String interpret() {
        if (action.equalsIgnoreCase("move")) {
            return "移动";
        } else if (action.equalsIgnoreCase("run")) {
            return "快速移动";
        } else {
            return "无效指令";
        }
    }

}
