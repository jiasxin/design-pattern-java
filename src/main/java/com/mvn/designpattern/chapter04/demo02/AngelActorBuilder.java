package com.mvn.designpattern.chapter04.demo02;

/**
 * 3 具体建造者  天使建造者
 * @author: jiasx
 * @date: 2021年6月26日23:10:19
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class AngelActorBuilder extends ActorBuilder{

    @Override
    public void buildType() {
        actor.setType("天使");
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
        actor.setHair("白长发");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("羽毛衣");
    }

}
