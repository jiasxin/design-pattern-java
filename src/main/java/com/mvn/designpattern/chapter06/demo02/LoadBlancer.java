package com.mvn.designpattern.chapter06.demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: jiasx
 * @date: 2021年6月27日8:40:38
 * @description:
 * @updateUser:
 * @updateDate:
 * @updateDescription:
 */
public class LoadBlancer {

    /**
     * 负载均衡唯一实例
     */
    private static LoadBlancer instance = null;

    /**
     * 服务器集合
     */
    private List serverList = null;

    /**
     * 当前提供服务的机器号
     */
    private int currentIndex = 0;

    public LoadBlancer(){
        serverList = new ArrayList();
    }

    /**
     * 静态公有工厂方法、返回唯一实例名称
     * @return
     */
    public static LoadBlancer getInstance() {
        if(instance == null){
            instance = new LoadBlancer();
        }
        return instance;
    }

    /**
     * 添加服务器
     * @param server
     */
    public void addServer(String server){
        serverList.add(server);
    }

    /**
     * 添加服务器
     * @param server
     */
    public void removeServer(String server){
        serverList.remove(server);
    }

    /**
     * 获取服务器
     * @return
     */
    public String getServer(){
        return getServer(LoadBlancerMode.ROUNDROBIN);
    }

    /**
     * 获取服务器
     * @param mode
     */
    private String getServer(String mode) {
        String server = "";
        if(mode.equals(LoadBlancerMode.RANDOM)){
            Random random = new Random();
            int index = random.nextInt(serverList.size());
            server = (String)serverList.get(index);
        }else if (mode.equals(LoadBlancerMode.ROUNDROBIN)){
            if (currentIndex >= serverList.size()) {
                currentIndex = 0;
            }
            server = (String)serverList.get(currentIndex);
            currentIndex++;
        }
        return server;
    }

}
