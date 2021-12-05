package com.mvn.designpattern.chapter23.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月21日22:55:51
 * @description: 公共方法放置到抽象父类
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class DataViewer {

    /**
     * 转换数据
     */
    public abstract void getData();

    /**
     * 具体方法：转换数据
     */
    public void convertData() {
        System.out.println("将数据转换为XML格式");
    }

    /**
     * 抽象方法：显示数据
     */
    public abstract void displayData();

    /**
     * 钩子方法 ： 判断是否为XML格式数据
     *
     * @return
     */
    public boolean isNotXMLData() {
        return true;
    }

    /**
     * 模板方法
     */
    public void process() {
        getData();
        if (isNotXMLData()) {
            convertData();
        }
        displayData();
    }

}
