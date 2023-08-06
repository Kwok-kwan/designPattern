package com.kuo.designPatterns.structural.adapter.class_adapter;

/**
 * SDAdapterTF
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/6
 * @description 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("adapter read tf card!");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card!");
        writeTF(msg);
    }
}
