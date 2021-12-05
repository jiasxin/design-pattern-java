package com.mvn.designpattern.chapter24.demo02;

/**
 * 2 全职员工类 充当具体元素类
 * @author: jiasx
 * @date: 2021年12月05日22:26:16
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class FullTimeEmployee implements Employee {

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 员工周薪
     */
    private double weeklyWage;

    /**
     * 工作时间
     */
    private int workTime;

    public FullTimeEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(double weeklyWage) {
        this.weeklyWage = weeklyWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department department) {
        //调用访问者的访问方法
        department.visit(this);
    }

}
