package com.mvn.designpattern.chapter20.demo01;

/**
 * @author: jiasx
 * @date: 2021年9月15日21:12:59
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        //定义观察目标对象
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");

        //定义四个观察者对象
        Observer player1 = new Player("杨过");
        acc.join(player1);

        Observer player2 = new Player("令狐冲");
        acc.join(player2);

        Observer player3 = new Player("张无忌");
        acc.join(player3);

        Observer player4 = new Player("段誉");
        acc.join(player4);

        //某成员遭受攻击
        player1.beAttacked(acc);

        //退出观察控制器
        acc.quit(player3);

        //某成员遭受攻击
        player1.beAttacked(acc);

    }

}
