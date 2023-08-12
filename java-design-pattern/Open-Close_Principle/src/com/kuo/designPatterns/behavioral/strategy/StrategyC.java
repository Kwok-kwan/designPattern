package com.kuo.designPatterns.behavioral.strategy;

/**
 * StrategyA
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 具体策略类，封装算法
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000元加1元换购任意200元以下商品");

    }
}
