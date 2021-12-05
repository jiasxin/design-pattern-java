package com.mvn.designpattern.chapter18.demo02;

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
        ConcreteMediator concreteMediator = new ConcreteMediator();

        //定义同事对象
        BoxComponent boxComponent = new BoxComponent();
        ButtonComponent buttonComponent = new ButtonComponent();
        ListComponent listComponent = new ListComponent();
        TextComponent textComponent = new TextComponent();

        //同事对象设置中介者
        boxComponent.setMediator(concreteMediator);
        buttonComponent.setMediator(concreteMediator);
        listComponent.setMediator(concreteMediator);
        textComponent.setMediator(concreteMediator);

        //中介者设置同事对象引用
        concreteMediator.box = boxComponent;
        concreteMediator.button = buttonComponent;
        concreteMediator.list = listComponent;
        concreteMediator.text = textComponent;

        buttonComponent.changed();
//        listComponent.changed();


    }

}
