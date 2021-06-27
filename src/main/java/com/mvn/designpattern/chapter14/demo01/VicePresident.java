package com.mvn.designpattern.chapter14.demo01;

/**
 * 具体处理者    副董事长
 */
public class VicePresident extends Approver {

    public VicePresident(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" + this.name + "审批采购单" + request.getNumber() + "余额：" + request.getAmount() + "元，采购目的" + request.getPurpose() + "。");
        } else {
            this.successor.processRequest(request);  //转发请求
        }
    }

}
