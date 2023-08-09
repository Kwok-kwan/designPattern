package com.kuo.designPatterns.structural.decorator;

/**
 * FastFood
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/8
 * @description 快餐类(抽象构建角色)
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}
