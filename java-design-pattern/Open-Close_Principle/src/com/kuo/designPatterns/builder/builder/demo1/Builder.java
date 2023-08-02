package com.kuo.designPatterns.builder.builder.demo1;

/**
 * Builder
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/1
 * @description 抽象构建者
 */
public abstract class Builder {
    protected Bike bike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();

}
