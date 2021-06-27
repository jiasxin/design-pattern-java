package com.mvn.designpattern.chapter17.demo01;

import java.util.*;

/**
 * 具体聚合类     商品数据类
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> products) {
        super(products);
    }

    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }

} 
