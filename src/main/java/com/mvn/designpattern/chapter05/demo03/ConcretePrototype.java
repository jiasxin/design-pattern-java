package com.mvn.designpattern.chapter05.demo03;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;

/**
 * 1 具体原型类 实现 Serializable 接口获得 序列化 能力  （此为深克隆）
 *
 * @author: jiasx
 * @date: 2021年6月27日7:27:39
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ConcretePrototype implements Serializable {

    /**
     * 成员变量
     */
    private String attr;

    private FileInfo fileInfo;

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getAttr() {
        return attr;
    }

    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    /**
     * 利用序列化技术转为JSON字符串实现深克隆
     * @return
     */
    public ConcretePrototype cloneDeepByJson() {
        return JSONObject.parseObject(JSON.toJSONString(this), ConcretePrototype.class);
    }

    /**
     * 利用序列化技术转为JSON字符串实现深克隆
     * @return
     */
    public ConcretePrototype cloneDeepByStream() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object obj = objectInputStream.readObject();
        return (ConcretePrototype)obj;
    }

}
