package com.mvn.designpattern.chapter20.demo02;

/**
 * @author: jiasx
 * @date: 2021年9月15日21:37:02
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        Person p1 = new Person("张三");
        Person p2 = new Person("李四");
        Person p3 = new Person("王五");

        Controller controller = new Controller();
        controller.add(p1);
        controller.add(p2);
        controller.add(p3);

        double price = 100;

        while (true) {
            double round = price + Math.random() * 100;
            if (price / round > 0.05f) {
                controller.notifyAllPerson(price);
            }
            price = round;
            Thread.sleep(3000);
        }

    }


}
