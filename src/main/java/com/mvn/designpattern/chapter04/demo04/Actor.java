package com.mvn.designpattern.chapter04.demo04;

/**
 *
 * 1 目标产品  角色
 * @author: jiasx
 * @date: 2021年6月26日22:57:50
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class Actor {

    /**
     * 角色类型
     */
    private String type;
    /**
     * 性别类型
     */
    private String sex;
    /**
     * 脸类型
     */
    private String face;
    /**
     * 头发类型
     */
    private String hair;
    /**
     * 服装类型
     */
    private String costume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }
}
