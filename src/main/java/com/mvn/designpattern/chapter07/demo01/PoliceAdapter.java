package com.mvn.designpattern.chapter07.demo01;

/**
 * 3 适配器  警车适配器类
 * @author: jiasx
 * @date: 2021年6月27日10:23:19
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class PoliceAdapter extends Controller {

    /**
     * 定义是配置者PoliceSound
     */
    private PoliceSound sound;

    /**
     * 定义是配置者PoliceLamp
     */
    private PoliceLamp lamp;

    public PoliceAdapter(){
        sound = new PoliceSound();
        lamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        sound.alarmSound();
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }

}
