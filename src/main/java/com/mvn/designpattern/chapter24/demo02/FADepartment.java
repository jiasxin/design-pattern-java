package com.mvn.designpattern.chapter24.demo02;

/**
 * 2 财务部类，充当具体访问者类
 *
 * @author: jiasx
 * @date: 2021年12月05日22:41:46
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class FADepartment extends Department {

    /**
     * 访问全职类型员工
     *
     * @param fullTimeEmployee
     */
    @Override
    public void visit(FullTimeEmployee fullTimeEmployee) {
        int workTime = fullTimeEmployee.getWorkTime();
        double weeklyWage = fullTimeEmployee.getWeeklyWage();
        if (workTime > 40) {
            weeklyWage = weeklyWage + (workTime) * 100;
        } else if (workTime < 40) {
            weeklyWage = weeklyWage + (workTime) * 80;
            if (weeklyWage < 0) {
                weeklyWage = 0;
            }
        }
        System.out.println("正式员工" + fullTimeEmployee.getName() + "实际工资：" + weeklyWage + "元");
    }

    /**
     * 访问兼职类型员工
     *
     * @param partTimeEmployee
     */
    @Override
    public void visit(PartTimeEmployee partTimeEmployee) {
        int workTime = partTimeEmployee.getWorkTime();
        double weeklyWage = partTimeEmployee.getWeeklyWage();
        System.out.println("正式员工" + partTimeEmployee.getName() + "实际工资：" + workTime * weeklyWage + "元");
    }

}
