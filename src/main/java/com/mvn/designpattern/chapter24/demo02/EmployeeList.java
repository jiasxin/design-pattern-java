package com.mvn.designpattern.chapter24.demo02;

import java.util.ArrayList;

/**
 * @author: jiasx
 * @date: 2021年12月05日23:55:07
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class EmployeeList {

    /**
     * 员工集合
     */
    private ArrayList<Employee> list = new ArrayList<>();

    /**
     * 添加员工
     * @param employee
     */
    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    /**
     * 遍历访问员工集合中的每一个员工对象
     *
     * @param department
     */
    public void accept(Department department) {
        for (Employee employee : list) {
            employee.accept(department);
        }
    }

}
