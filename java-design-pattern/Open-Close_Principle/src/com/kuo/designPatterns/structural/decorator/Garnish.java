package com.kuo.designPatterns.structural.decorator;

/**
 * Garinish
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/8
 * @description 装饰者类（抽象装饰者角色）
 */
public abstract class Garnish extends FastFood {
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
