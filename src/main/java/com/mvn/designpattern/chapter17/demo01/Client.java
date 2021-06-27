package com.mvn.designpattern.chapter17.demo01;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String args[]) {

        List<Object> products = new ArrayList<Object>();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("碧血剑");
        products.add("天魔剑");
        products.add("饮血刀");

        AbstractObjectList list;
        AbstractIterator iterator;

        list = new ProductList(products);
        iterator = list.createIterator();

        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem());
            iterator.next();
        }

        System.out.println();
        while (!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem());
            iterator.previous();
        }

    }

}
