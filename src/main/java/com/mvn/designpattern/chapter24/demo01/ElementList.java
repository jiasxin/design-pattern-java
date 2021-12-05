package com.mvn.designpattern.chapter24.demo01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: jiasx
 * @date: 2021年9月21日23:42:12
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ElementList {

    private ArrayList<Element> list = new ArrayList<Element>();//定义一个集合用于存储元素对象

    /**
     * 接收访问者访问操作
     * @param visitor
     */
    public void accept(Visitor visitor){
        Iterator<Element> iterator = list.iterator();
        while (iterator.hasNext()){
            Element next = iterator.next();
            next.accept(visitor);
        }
    }

    public void addElement(Element element){
        list.add(element);
    }

    public void removeElement(Element element){
        list.remove(element);
    }

}
