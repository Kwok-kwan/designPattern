package com.kuo.designPatterns.structural.fly_weight;

/**
 * Client
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/12
 * @description 享元模式
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox i = BoxFactory.getInstance().getShape("I");
        i.display("灰色");
    }
}
