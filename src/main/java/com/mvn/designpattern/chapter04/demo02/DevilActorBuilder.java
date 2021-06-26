package com.mvn.designpattern.chapter04.demo02;

/**
 * 3 具体建造者  魔鬼建造者
 * @author: jiasx
 * @date: 2021年6月26日23:11:24
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class DevilActorBuilder  extends ActorBuilder{

    @Override
    public void buildType() {
        actor.setType("魔鬼");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("长脸");
    }

    @Override
    public void buildHair() {
        actor.setHair("黑短发");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("死神服装");
    }

}