package com.mvn.designpattern.chapter04.demo02;

import com.alibaba.fastjson.JSON;

/**
 * 测试建造者模式
 * @author: jiasx
 * @date: 2021年6月26日23:12:43
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Test {

    public static void main(String[] args) {

        ActorController actorController = new ActorController();
        ActorBuilder actorBuilder = null;
        Actor actor = null;

        actorBuilder = new AngelActorBuilder();
        actor = actorController.construct(actorBuilder);
        System.out.println(JSON.toJSONString(actor));

        actorBuilder = new DevilActorBuilder();
        actor = actorController.construct(actorBuilder);
        System.out.println(JSON.toJSONString(actor));

    }

}
