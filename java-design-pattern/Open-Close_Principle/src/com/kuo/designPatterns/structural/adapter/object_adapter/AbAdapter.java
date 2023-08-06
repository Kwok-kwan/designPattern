package com.kuo.designPatterns.structural.adapter.object_adapter;

/**
 * AdapterPra
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/6
 * @description 接口适配器模式
 */
public abstract class AbAdapter implements SDCard {
    @Override
    public String readSD() {
        return null;
    }

    @Override
    public void writeSD(String msg) {

    }
}
