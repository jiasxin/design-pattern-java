package com.mvn.designpattern.chapter05.demo02;


/**
 * 1 具体原型类 实现 Cloneable 接口获得 clone 能力  （此为浅克隆）
 *
 * @author: jiasx
 * @date: 2021年6月27日7:27:39
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcretePrototype implements Cloneable {

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
    public ConcretePrototype clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (ConcretePrototype) object;
    }

}
