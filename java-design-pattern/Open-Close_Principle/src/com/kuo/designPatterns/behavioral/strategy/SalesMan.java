package com.kuo.designPatterns.behavioral.strategy;

/**
 * SalesMan
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 促销员 环境类
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow(){
        strategy.show();
    }
}
