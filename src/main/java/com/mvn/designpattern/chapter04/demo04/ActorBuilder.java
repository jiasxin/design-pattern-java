package com.mvn.designpattern.chapter04.demo04;

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
     * 去除形参直接调用buildXXX构建
     * @return
     */
    public Actor construct(){
        this.buildType();
        this.buildSex();
        this.buildFace();
        this.buildHair();
        this.buildCostume();
        return actor;
    }

}
