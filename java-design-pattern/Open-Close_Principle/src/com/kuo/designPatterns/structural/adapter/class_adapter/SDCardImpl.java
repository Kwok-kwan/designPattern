package com.kuo.designPatterns.structural.adapter.class_adapter;

/**
 * SDCardImpl
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/6
 * @description 具体的sd卡
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard 读取SD卡数据：  hello SDCard!";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write " + msg);
    }
}
