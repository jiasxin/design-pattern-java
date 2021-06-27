package com.mvn.designpattern.chapter07.demo01;

/**
 * @author: jiasx
 * @date: 2021年6月27日10:31:34
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        Controller controller = new PoliceAdapter();
        controller.move();
        controller.phonate();
        controller.twinkle();

        controller = new UfoAdapter();
        controller.move();
        controller.phonate();
        controller.twinkle();

    }

}
