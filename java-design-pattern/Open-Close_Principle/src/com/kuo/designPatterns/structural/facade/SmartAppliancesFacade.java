package com.kuo.designPatterns.structural.facade;

/**
 * SmartAppliancesFacade
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/10
 * @description 外观类
 */
public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }
    public void say(String message){
        if (message.contains("打开")){
            on();
        } else if (message.contains("关闭")){
            off();
        } else {
            System.out.println("我还听不懂你说的。。。");
        }
    }

    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }

    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }
}
