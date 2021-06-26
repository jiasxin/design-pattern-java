package com.mvn.designpattern.chapter04.demo03;

/**
 * 2 角色建造者
 * @author: jiasx
 * @date: 2021年6月26日23:00:24
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildHair();
    public abstract void buildCostume();

    /**
     * 指挥者与抽象建造者合并
     * @param actorBuilder
     * @return
     */
    public Actor construct(ActorBuilder actorBuilder){
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildHair();
        actorBuilder.buildCostume();
        return actor;
    }

}
