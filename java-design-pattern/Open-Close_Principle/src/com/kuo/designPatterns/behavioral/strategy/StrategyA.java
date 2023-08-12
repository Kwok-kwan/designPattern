package com.kuo.designPatterns.behavioral.strategy;

/**
 * StrategyA
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/13
 * @description 具体策略类，封装算法
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");

    }
}
