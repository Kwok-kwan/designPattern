package com.kuo.designPatterns.structural.adapter.object_adapter;

/**
 * TFCard
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/6
 * @description 适配者类的接口
 */
public interface TFCard {
    String readTF();
    void writeTF(String msg);
}
