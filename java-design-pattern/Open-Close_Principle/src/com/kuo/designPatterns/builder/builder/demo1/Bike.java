package com.kuo.designPatterns.builder.builder.demo1;

/**
 * Bike
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/1
 * @description 产品对象
 */
public class Bike {
    private String frame; // 车架
    private String seat; // 车座

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}
