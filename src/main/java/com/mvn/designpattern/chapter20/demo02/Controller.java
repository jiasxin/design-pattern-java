package com.mvn.designpattern.chapter20.demo02;

import java.util.ArrayList;

/**
 * @author: jiasx
 * @date: 2021年9月15日21:28:39
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Controller {

    protected ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void notifyAllPerson(double price) {
        for (Person person : personList) {
            person.sendPrice(price);
        }
    }
    
}
