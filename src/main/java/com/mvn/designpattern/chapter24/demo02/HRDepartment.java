package com.mvn.designpattern.chapter24.demo02;

/**
 * 2 人力资源部类 充当具体访问者类Q
 *
 * @author: jiasx
 * @date: 2021年12月05日22:52:01
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class HRDepartment extends Department {

    /**
     * 实现人力资源对全职员工的访问
     *
     * @param fullTimeEmployee
     */
    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        int workTime = fullTimeEmployee.getWorkTime();
        System.out.println("正式员工" + fullTimeEmployee.getName() + "实际工作时间为：" + workTime + "小时");
        if (workTime > 40) {
            System.out.println("正式员工" + fullTimeEmployee.getName() + "加班时间为：" + (workTime - 40) + "小时");
        } else if (workTime < 40) {
            System.out.println("正式员工" + fullTimeEmployee.getName() + "请假时间为：" + (40 - workTime) + "小时");
        }
    }

    /**
     * 实现人力资源部对兼职员工的访问
     *
     * @param partTimeEmployee
     */
    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        int workTime = partTimeEmployee.getWorkTime();
        System.out.println("临时员工" + partTimeEmployee.getName() + "实际工作时间为：" + workTime + "小时");
    }

}
