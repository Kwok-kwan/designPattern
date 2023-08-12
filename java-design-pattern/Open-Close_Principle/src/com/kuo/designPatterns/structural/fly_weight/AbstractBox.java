package com.kuo.designPatterns.structural.fly_weight;

/**
 * AdstractBos
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/12
 * @description 抽象享元角色
 */
public abstract class AbstractBox {
    // 获取图形
    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状："+getShape()+",颜色："+color);
    }
}
