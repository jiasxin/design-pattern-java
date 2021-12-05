package com.mvn.designpattern.chapter23.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月21日23:30:59
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class XmlDataViever extends DataViewer{

    @Override
    public void getData() {
        System.out.println("从XML文件中获取数据");
    }

    @Override
    public void displayData() {
        System.out.println("已柱状图显示数据");
    }

    //覆盖父类的钩子方法
    @Override
    public boolean isNotXMLData() {
        return false;
    }

}
