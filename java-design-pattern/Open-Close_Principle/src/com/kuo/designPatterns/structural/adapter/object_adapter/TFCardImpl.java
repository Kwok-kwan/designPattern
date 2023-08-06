package com.kuo.designPatterns.structural.adapter.object_adapter;

/**
 * TFCardImpl
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/6
 * @description 适配者类
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard 读取数据，hello TFCard！";
        return msg;
    }

    @Override
    public void  writeTF(String msg) {
        System.out.println("TFCard write message:"+msg);
    }
}
