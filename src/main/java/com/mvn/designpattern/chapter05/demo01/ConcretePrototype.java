package com.mvn.designpattern.chapter05.demo01;

/**
 * 1 具体原型类  继承 Prototype 获得 clone 能力  （此为浅克隆）
 *
 * 浅克隆：只复制基本数据类型，引用数据类型则复制的是地址
 * 深克隆：无论对象成员的变量是值类型还是引用类型都将复制一份给克隆对象
 *
 * @author: jiasx
 * @date: 2021年6月27日7:27:39
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcretePrototype extends Prototype {

    /**
     * 成员变量
     */
    private String attr;

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getAttr() {
        return attr;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAttr(this.attr);
        return prototype;
    }

}
