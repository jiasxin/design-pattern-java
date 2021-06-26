package com.mvn.designpattern.chapter04.demo02;

/**
 * 4 建造指挥者  角色构建动态指定建造者
 * @author: jiasx
 * @date: 2021年6月26日23:13:36
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class ActorController {

    public Actor construct(ActorBuilder actorBuilder){
        Actor actor = null;
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildHair();
        actorBuilder.buildCostume();
        actor = actorBuilder.getActor();
        return actor;
    }

}
