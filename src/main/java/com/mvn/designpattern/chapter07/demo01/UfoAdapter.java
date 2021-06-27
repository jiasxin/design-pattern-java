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
public class UfoAdapter extends Controller {

    /**
     * 定义是配置者PoliceSound
     */
    private UfoSound sound;

    /**
     * 定义是配置者PoliceLamp
     */
    private UfoLamp lamp;

    public UfoAdapter(){
        sound = new UfoSound();
        lamp = new UfoLamp();
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
