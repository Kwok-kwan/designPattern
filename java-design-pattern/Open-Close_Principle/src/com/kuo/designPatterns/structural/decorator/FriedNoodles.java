package com.kuo.designPatterns.structural.decorator;

/**
 * FriedNoodles
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/8
 * @description 炒面（具体的构建角色）
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
