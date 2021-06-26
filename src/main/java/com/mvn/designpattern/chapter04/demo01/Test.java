package com.mvn.designpattern.chapter04.demo01;

import com.alibaba.fastjson.JSON;

/**
 * 测试建造者模式
 *
 * @author: jiasx
 * @date: 2021年6月26日22:48:56
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        Builder builder = null;
        Director director = null;
        Product product = null;

        builder = new ConcreteBuilder1();
        director = new Director(builder);
        product = director.construct();

        System.out.println(JSON.toJSONString(product));

        builder = new ConcreteBuilder2();
        director.setBuilder(builder);
        product = director.construct();

        System.out.println(JSON.toJSONString(product));

    }

}
