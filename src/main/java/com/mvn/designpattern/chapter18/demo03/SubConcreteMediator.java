package com.mvn.designpattern.chapter18.demo03;

/**
 * @author: jiasx
 * @date: 2021年9月12日0:02:52
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class SubConcreteMediator extends ConcreteMediator {

    //增加对Label对象的引用
    public LabelComponent label;

    @Override
    public void componentChanged(Component component) {
        if (component == button) {
            System.out.println("按钮点击");
            list.update();
            text.update();
            box.update();
            label.update();
        } else {
            super.componentChanged(component);
        }
    }

}
