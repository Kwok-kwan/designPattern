package com.kuo.designPatterns.behavioral.temlate;

/**
 * ConcreateCLass_BaoCai
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/12
 * @description 炒菜心类
 */
public class ConcreteClass_CaiXin extends AbstractClass {

    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
