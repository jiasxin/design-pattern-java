package com.mvn.designpattern.chapter08.demo02;

/**
 * 2 具体实现类   Unix操作系统具体实现类
 */
public class UnixImageImpl implements Image {

    public void doPaint(Matrix m) {
        System.out.print("调用Unix绘制函数显示图像");
    }

}