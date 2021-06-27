package com.mvn.designpattern.chapter14.demo01;

/**
 * 董事会类 具体处理者
 */
public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    //具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        System.out.println("董事会" + this.name + "审批采购单" + request.getNumber() + "余额：" + request.getAmount() + "元，采购目的" + request.getPurpose() + "。");
    }

}