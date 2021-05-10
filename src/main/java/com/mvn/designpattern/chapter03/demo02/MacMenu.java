package com.mvn.designpattern.chapter03.demo02;

/**
 * 2 创建具体产品
 *
 * Mac主题按钮
 */
public class MacMenu implements Menu{
    @Override
    public void display() {
        System.out.println("Mac主题菜单");
    }
}
