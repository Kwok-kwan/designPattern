package com.kuo.designPatterns.structural.decorator;

/**
 * FriedRice
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/8
 * @description 炒饭（具体构建角色）
 */
public class FriedRice extends FastFood{
    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
