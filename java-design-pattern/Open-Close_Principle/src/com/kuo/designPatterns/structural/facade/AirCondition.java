package com.kuo.designPatterns.structural.facade;

/**
 * AirCondition
 *
 * @author kuo_kwan
 * @version 1.0
 * @date 2023/8/10
 * @description 空调类
 */
public class AirCondition {
    public void on(){
        System.out.println("打开空调。。。。");
    }
    public void off(){
        System.out.println("关闭空调。。。。");
    }
}
