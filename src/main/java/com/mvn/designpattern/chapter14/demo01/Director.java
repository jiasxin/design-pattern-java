package com.mvn.designpattern.chapter14.demo01;

/**
 * 3 具体处理者   主任
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    //具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
        	//处理请求
            System.out.println("主任" + this.name + "审批采购单" + request.getNumber() + "余额：" + request.getAmount() + "元，采购目的" + request.getPurpose() + "。");
        } else {
            this.successor.processRequest(request);  //转发请求
        }
    }

}
