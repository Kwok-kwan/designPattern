package com.kuo.designPatterns.structural.decorator;

/**
 * Egg
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/8
 * @description 鸡蛋类（具体的装饰者类）
 */
public class Egg extends Garnish {
    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }
}
