package com.kuo.designPatterns.builder.builder.demo1;

/**
 * MobileBuilder
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/1
 * @description 具体的构建者，摩拜单车
 */
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮座驾");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
