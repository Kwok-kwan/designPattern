package com.kuo.designPatterns.structural.facade;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/10
 * @description 迪米特法则典型应用 外观模式
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开螺丝钉咖啡碱案件");
    }
}
