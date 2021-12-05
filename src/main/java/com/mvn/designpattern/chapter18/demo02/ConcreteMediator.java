package com.mvn.designpattern.chapter18.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月11日17:45:09
 * @description: 2 具体中介者类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcreteMediator extends Mediator {

    //维持对各个同事对象的引用
    public ButtonComponent button;
    public ListComponent list;
    public TextComponent text;
    public BoxComponent box;

    @Override
    public void componentChanged(Component component) {
        if (component == button) {
            System.out.println("按钮点击");
            list.update();
            text.update();
            box.update();
        } else if (component == list) {
            System.out.println("从列表框选择用户");
            box.select();
            text.setText();
        }else if (component == box) {
            System.out.println("从组合框选择客户");
            box.select();
            text.setText();
        }
    }

}
