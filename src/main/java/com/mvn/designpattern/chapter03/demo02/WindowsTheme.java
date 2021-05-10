package com.mvn.designpattern.chapter03.demo02;

/**
 * 4 创建具体工厂
 *
 * Windows主题
 */
public class WindowsTheme implements Theme{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
    
}
