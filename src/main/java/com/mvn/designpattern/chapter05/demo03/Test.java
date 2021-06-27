package com.mvn.designpattern.chapter05.demo03;

import java.io.IOException;

/**
 * 测试原型模式  深克隆测试
 * @author: jiasx
 * @date: 2021年6月27日7:56:43
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ConcretePrototype object = new ConcretePrototype();
        object.setAttr("vvv");
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("aaa");
        object.setFileInfo(fileInfo);
        System.out.println(object);

        ConcretePrototype object2 = object.cloneDeepByJson();
        System.out.println(object2);

        ConcretePrototype object3 = object.cloneDeepByStream();
        System.out.println(object3);

    }

}
