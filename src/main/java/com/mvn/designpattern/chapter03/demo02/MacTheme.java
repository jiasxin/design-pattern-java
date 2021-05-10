package com.mvn.designpattern.chapter03.demo02;

/**
 * 4 创建具体工厂
 *
 * Mac主题
 */
public class MacTheme implements Theme{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

}
