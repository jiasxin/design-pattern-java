package com.mvn.designpattern.chapter14.demo01;

/**
 * 职责链模式测试
 */
public class Client {

    public static void main(String[] args) {

        Approver wjzhang, sfzhang, gyang, jguo, meeting;

        wjzhang = new Director("张无忌");
        sfzhang = new Manager("张三丰");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        //创建职责链
        wjzhang.setSuccessor(sfzhang);
        sfzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(75000, 10002, "购买葵花宝典");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买屠龙宝刀");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买玉女心经");
        wjzhang.processRequest(pr4);

    }
} 
