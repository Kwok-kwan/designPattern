package com.kuo.designPatterns.structural.proxy.static_proxy;

/**
 * ProxyPoint
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/2
 * @description 代售点
 */
public class ProxyPoint implements SellTickets {
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取服务费用！");
        trainStation.sell();

    }
}
