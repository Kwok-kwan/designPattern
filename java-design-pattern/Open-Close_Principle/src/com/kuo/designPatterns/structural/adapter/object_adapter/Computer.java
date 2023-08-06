package com.kuo.designPatterns.structural.adapter.object_adapter;

/**
 * Computer
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/6
 * @description 计算机类
 */
public class Computer {
    public String readSD(SDCard sdCard){
        if (sdCard== null){
            throw new NullPointerException("SDCard is not null!");
        }
        return sdCard.readSD();
    }

}
