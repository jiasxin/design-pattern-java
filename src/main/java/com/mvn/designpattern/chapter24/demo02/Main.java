package com.mvn.designpattern.chapter24.demo02;

/**
 * @author: jiasx
 * @date: 2021年12月06日0:00:47
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Main {

    public static void main(String[] args) {

        EmployeeList employeeList = new EmployeeList();

        Employee e1, e2, e3, e4, e5, e6;
        e1 = new FullTimeEmployee("张无忌", 3200, 45);
        e2 = new FullTimeEmployee("令狐冲", 200, 40);
        e3 = new FullTimeEmployee("风清扬", 200, 16);
        e4 = new PartTimeEmployee("洪七公", 2400, 38);
        e5 = new PartTimeEmployee("欧阳锋", 80, 20);
        e6 = new PartTimeEmployee("慕容复", 60, 18);

        employeeList.addEmployee(e1);
        employeeList.addEmployee(e2);
        employeeList.addEmployee(e3);
        employeeList.addEmployee(e4);
        employeeList.addEmployee(e5);
        employeeList.addEmployee(e6);

        Department department = null;
        department = new FADepartment();
        employeeList.accept(department);
        department = new HRDepartment();
        employeeList.accept(department);

    }

}
