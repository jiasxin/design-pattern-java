package com.mvn.designpattern.chapter16.demo01;

import java.util.*;

/**
 * 指令处理类
 */
public class InstructionHandler {

    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        Stack<AbstractNode> stack = new Stack<AbstractNode>(); //声明一个栈对象用于存储抽象语法树
        String[] words = instruction.split(" "); //以空格分割指令字符
        for (int i = 0; i < words.length; i++) {
            //
            if (words[i].equalsIgnoreCase("and")) {
                left = (AbstractNode) stack.pop(); //弹出栈顶表达式作为左表达式
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance); //右表达式
                stack.push(new AndNode(left, right)); //将新表达式压入栈中
            } else {
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left); //将新表达式压入栈中
            }
        }
        this.node = (AbstractNode) stack.pop(); //将全部表达式从栈中弹出
    }

    public String output() {
        String result = node.interpret(); //解释表达式
        return result;
    }

}