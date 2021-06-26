package com.mvn.designpattern.chapter04.demo05;

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
     * 抽象建造者类指定默认钩子方法
     * @return
     */
    public boolean isBareHeaded(){
        return false;
    }

    public Actor getActor() {
        return actor;
    }

}
