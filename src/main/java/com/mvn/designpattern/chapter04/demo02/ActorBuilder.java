package com.mvn.designpattern.chapter04.demo02;

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

    public Actor getActor() {
        return actor;
    }

}
