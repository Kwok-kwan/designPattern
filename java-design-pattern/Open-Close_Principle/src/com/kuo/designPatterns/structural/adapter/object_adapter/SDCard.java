package com.kuo.designPatterns.structural.adapter.object_adapter;

/**
 * SDCard
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/6
 * @description SDCard
 */
public interface SDCard {
    String readSD();
    void writeSD(String msg);
}
