package com.mvn.designpattern.chapter14.demo01;

/**
 * 具体处理者   经理
 */
public class Manager extends Approver {

	public Manager(String name) {
		super(name);
	}
	
	public void processRequest(PurchaseRequest request) {
		if (request.getAmount() < 80000) {
			System.out.println("经理" + this.name + "审批采购单" + request.getNumber() + "余额：" + request.getAmount() + "元，采购目的" + request.getPurpose() + "。");
		} else {
			this.successor.processRequest(request);  //转发请求
		}
	}

}