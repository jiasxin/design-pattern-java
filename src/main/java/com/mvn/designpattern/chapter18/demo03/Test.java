package com.mvn.designpattern.chapter18.demo03;

/**
 * @author: jiasx
 * @date: 2021年9月11日23:49:43
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        //定义中介者对象
        SubConcreteMediator concreteMediator = new SubConcreteMediator();

        //定义同事对象
        LabelComponent labelComponent = new LabelComponent();
        BoxComponent boxComponent = new BoxComponent();
        ButtonComponent buttonComponent = new ButtonComponent();
        ListComponent listComponent = new ListComponent();
        TextComponent textComponent = new TextComponent();

        //同事对象设置中介者
        labelComponent.setMediator(concreteMediator);
        boxComponent.setMediator(concreteMediator);
        buttonComponent.setMediator(concreteMediator);
        listComponent.setMediator(concreteMediator);
        textComponent.setMediator(concreteMediator);

        //中介者设置同事对象引用
        concreteMediator.label = labelComponent;
        concreteMediator.box = boxComponent;
        concreteMediator.button = buttonComponent;
        concreteMediator.list = listComponent;
        concreteMediator.text = textComponent;

        buttonComponent.changed();

    }

}
