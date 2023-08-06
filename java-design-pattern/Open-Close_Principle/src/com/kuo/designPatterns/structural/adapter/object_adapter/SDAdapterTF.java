package com.kuo.designPatterns.structural.adapter.object_adapter;

/**
 * SDAdapterTF
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/6
 * @description 适配器类
 */
public class SDAdapterTF  implements SDCard {
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card!");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card!");
        tfCard.writeTF(msg);
    }
}
