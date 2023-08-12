package com.kuo.designPatterns.behavioral.strategy;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description TODO
 */
public class Client {
    public static void main(String[] args) {
        SalesMan man = new SalesMan(new StrategyA());
        man.salesManShow();
    }
}
