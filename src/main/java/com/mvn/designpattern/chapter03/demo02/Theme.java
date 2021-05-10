package com.mvn.designpattern.chapter03.demo02;

/**
 * 3 创建抽象工厂
 *
 * 主题公共方法接口
 */
public interface Theme {

    /**
     * 创建按钮
     * @return
     */
    public Button createButton();

    /**
     * 创建菜单
     * @return
     */
    public Menu createMenu();

}
