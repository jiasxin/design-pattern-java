package com.mvn.designpattern.chapter05.demo03;

import java.io.Serializable;

/**
 * @author: jiasx
 * @date: 2021年6月27日7:58:35
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class FileInfo implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
