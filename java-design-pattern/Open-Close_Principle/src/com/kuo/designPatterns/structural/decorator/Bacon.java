package com.kuo.designPatterns.structural.decorator;

/**
 * Egg
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/8
 * @description 培根类（具体的装饰者类）
 */
public class Bacon extends Garnish {
    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }
}
