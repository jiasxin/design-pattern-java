package com.mvn.designpattern.chapter08.demo02;

/**
 * 2 具体实现类   Windows操作系统具体实现类
 */
public class WindowsImageImpl implements Image {

    public void doPaint(Matrix m) {
        System.out.print("调用Windows绘制函数显示图像");
    }

}