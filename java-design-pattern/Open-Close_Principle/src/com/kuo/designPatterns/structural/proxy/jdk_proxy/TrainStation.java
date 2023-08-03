package com.kuo.designPatterns.structural.proxy.jdk_proxy;

/**
 * TrainStation
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/2
 * @description 火车站类
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
