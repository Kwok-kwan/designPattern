package com.kuo.designPatterns.builder.builder.demo1;

/**
 * Director
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/1
 * @description 指挥者类
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
