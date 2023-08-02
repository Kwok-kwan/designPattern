package com.kuo.designPatterns.builder.builder.demo1;

/**
 * OfoBuilder
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/1
 * @description ofo 单车构建者
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
